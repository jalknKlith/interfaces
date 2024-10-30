package models;
import config.Conexion;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Producto extends Conexion {
    public int idProducto;
    public String nombre;
    public String descripcion;
    public double precio;
    public int cantidad;
    public int categoriaID;

    //constructores
    public Producto() {
    }

    public Producto(int idProducto, String nombre, String descripcion, double precio, int cantidad, int categoriaID) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoriaID = categoriaID;
    }
    
    //getters

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCategoriaID() {
        return categoriaID;
    }
    
    //setters

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }
    
    //metodos
    
    //resgistrar producto
    public ArrayList<Producto> listarProductos(){
        String query = "SELECT * FROM productos;";
        ArrayList<Producto> tablaProductos = new ArrayList<>();
        try {
            Statement stm = conectar().createStatement();//permite preparar la consulta
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Producto objProd = new Producto();
                objProd.setIdProducto(rs.getInt("idProducto"));
                objProd.setNombre(rs.getString("nombre"));
                objProd.setDescripcion(rs.getString("descripcion"));
                objProd.setPrecio(rs.getFloat("precio"));
                objProd.setIdProducto(rs.getInt("cantidad"));
                objProd.setCategoriaID(rs.getInt("categoriaID"));
                tablaProductos.add(objProd);
            }
            this.cn.close();//cerrar la conexion
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return tablaProductos;
    }
    
    //metodo de registrar
    
    public String registrarProducto(Producto p){
        String query = "INSERT INTO productos(nombre, descripcion, precio, cantidad, categoriaID)"
                        +"VALUES('"+p.getNombre()+"', '"+p.getDescripcion()+"',"+p.getPrecio()+","+p.getCantidad()+","+p.getCategoriaID()+");";
        int rpt; String msj="";
        try {
            Statement stm = conectar().createStatement();
            rpt = stm.executeUpdate(query);
            if(rpt == 1){
                msj = "Registro exitoso";
            }
        } catch (SQLException e) {
            msj = "Error"+e.getMessage();
        }
        return msj;
    }
    
    //metodo actualizar
    public String actualizarProducto(Producto p){
        String query = "UPDATE productos SET nombre='"+p.getNombre()+"',"
                       +"descripcion='"+p.getDescripcion()+"',"
                       +"precio="+p.getPrecio()+","
                       + "cantidad="+p.getCantidad()+","
                       + "categoriaID="+p.getCategoriaID()+" "
                       + "WHERE idProducto="+p.getIdProducto();
                        
        int rpt; String msj="";
        try {
            Statement stm = conectar().createStatement();
            rpt = stm.executeUpdate(query);
            if(rpt == 1){
                msj = "Actualizacion exitosa";
            }
        } catch (SQLException e) {
            msj = "Error"+e.getMessage();
        }
        return msj;
    }
    
    //metodo eliminar dato
    public String eliminar(Producto p){
        String query = "DELETE FROM productos WHERE idProducto = "+p.getIdProducto();
                        
        int rpt; String msj="";
        try {
            Statement stm = conectar().createStatement();
            rpt = stm.executeUpdate(query);
            if(rpt == 1){
                msj = "Eliminado exitosamente";
            }
        } catch (SQLException e) {
            msj = "Error"+e.getMessage();
        }
        return msj;
    }
    
}

    
