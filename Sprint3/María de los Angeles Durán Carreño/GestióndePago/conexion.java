package creaciones_asbleidy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class conexion {

    private static Connection conn;
    private static final String user = "postgres";
    private static final String pass = "1234";
    private static final String db = "jdbc:postgresql://localhost:5432/creaciones_asbleidy";
    static Statement sentencia;
    static ResultSet resultado;
    static conexion cc = new conexion();
    static Connection cn = cc.getConection();

    public conexion() {
        conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(db, user, pass);
            if (conn != null) {
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e.toString());
        }
    }

    public static Connection getConection() {
        return conn;
    }

    public void destroyConnection() {
        conn = null;
        System.out.println("Conexion Terminada");
    }

    //Método para llenar un JComboBox con datos específicos de una tabla de la base de datos 
    public static ArrayList<String> llenar_combo_productos() {
        ArrayList<String> Lista = new ArrayList<String>();
        //Se crea la sentencia para consultar el nombre de todos los productos
        String sql = "select nombre from producto order by nombre";
        try {
            sentencia = cn.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            while (resultado.next()) {
                //Se agrega cada dato a una lista
                Lista.add(resultado.getString("nombre"));
            }
        } catch (Exception e) {
        }
        //Se retorna la lista con todos los datos obtenidos
        return Lista;
    }

    //Método para llenar un JComboBox con datos específicos de una tabla de la base de datos 
    public static ArrayList<String> llenar_combo_disponibles() {
        ArrayList<String> Lista = new ArrayList<String>();
        //Se crea la sentencia para consultar la información de los productos disponibles
        String sql = "select p.nombre from inventario i inner join producto p on i.codigo=p.codigo where i.unidades_d>0 order by i.codigo";
        try {
            sentencia = cn.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            while (resultado.next()) {
                //Se agrega cada dato a una lista
                Lista.add(resultado.getString("nombre"));
            }
        } catch (Exception e) {
        }
        //Se retorna la lista con todos los datos obtenidos
        return Lista;
    }
    
    //Método para llenar un JComboBox con datos específicos de una tabla de la base de datos 
    public static ArrayList<String> llenar_combo_compra() {
        ArrayList<String> Lista = new ArrayList<String>();
        //Se crea la sentencia para consultar el nombre de los productos disponibles sin repetirlos
        String sql = "select distinct(p.nombre) from inventario i inner join producto p on i.codigo=p.codigo where i.unidades_d>0";
        try {
            sentencia = cn.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            while (resultado.next()) {
                //Se agrega cada dato a una lista
                Lista.add(resultado.getString("nombre"));
            }
        } catch (Exception e) {
        }
        //Se retorna la lista con todos los datos obtenidos
        return Lista;
    }

    //Método para llenar un JComboBox con datos específicos de una tabla de la base de datos 
    public static ArrayList<String> llenar_combo_color(String pr) {
        ArrayList<String> Lista = new ArrayList<String>();
        //Se crea la sentencia para consultar los colores disponibles de un producto
        String sql = "select i.color from inventario i inner join producto p on i.codigo=p.codigo where p.nombre='" + pr + "' order by i.codigo";
        try {
            sentencia = cn.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            while (resultado.next()) {
                //Se agrega cada dato a una lista
                Lista.add(resultado.getString("color"));
            }
        } catch (Exception e) {
        }
        //Se retorna la lista con todos los datos obtenidos
        return Lista;
    }

    //Método para llenar un JComboBox con datos específicos de una tabla de la base de datos 
    public static ArrayList<String> llenar_combo_talla(String pr, String col) {
        ArrayList<String> Lista = new ArrayList<String>();
        //Se crea la sentencia para consultar las tallas disponibles de un producto de acuerdo al color
        String sql = "select i.talla from inventario i inner join producto p on i.codigo=p.codigo where p.nombre='" + pr + "' and i.color='" + col + "' order by i.codigo";
        try {
            sentencia = cn.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            while (resultado.next()) {
                //Se agrega cada dato a una lista
                Lista.add(resultado.getString("talla"));
            }
        } catch (Exception e) {
        }
        //Se retorna la lista con todos los datos obtenidos
        return Lista;
    }

    //Método para obtener la información de una tabla de la base de datos
    public static ResultSet getTabla(String Consulta) {
        Connection conect = getConection();
        Statement st;
        ResultSet datos = null;
        try {
            st = conect.createStatement();
            datos = st.executeQuery(Consulta);
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        //Retorna todos los datos obtenidos
        return datos;
    }

}
