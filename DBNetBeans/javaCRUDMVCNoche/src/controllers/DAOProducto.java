package controllers;
import java.util.ArrayList;
import models.Producto;
//import models.Categoria;

public class DAOProducto {
    Producto objProducto = new Producto();
    public ArrayList<Producto> lstProductos(){
        return objProducto.listarProductos();
    }
    public String regProducto(Producto p){
        return objProducto.registrarProducto(p);
    }
    public String editarProducto(Producto p){
        return objProducto.actualizarProducto(p);
    }
    public String eliminarProducto(Producto p){
        return objProducto.eliminar(p);
    }
    
}
