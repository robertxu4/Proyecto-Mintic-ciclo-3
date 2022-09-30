
package test;

import beans.Producto;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OpéracionesBD {
        public static void main(String[] args) {
     listarProductos();
    }
    
    public static void actualizarProductos(int id_producto, String marca){
        DBConnection con = new DBConnection();
        String sql = "UPDATE producto SET marca = '"+marca+"'WHERE id_producto ="+id_producto;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());  
        }
        finally{
            con.desconectar();
        }
    }
    public static void listarProductos(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM producto";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id_producto = rs.getInt("id_producto");
                String marca = rs.getString("marca");
                int existencias = rs.getInt("existencias");
                String especificaciones = rs.getString("especificaciones");
                double precio = rs.getDouble("precio");
                
                Producto productos = new Producto(id_producto, marca, existencias, especificaciones, precio);
                System.out.println(productos.toString());
            
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());  
        }
        finally{
            con.desconectar();
        }
    } 
}
