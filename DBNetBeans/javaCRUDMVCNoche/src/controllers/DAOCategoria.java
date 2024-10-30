package controllers;
import java.util.ArrayList;
import models.Categoria;
import javax.swing.JComboBox;
import models.Producto;

public class DAOCategoria {
    Categoria objCategoria = new Categoria();
    public void llenarCategorias(JComboBox c){
        objCategoria.getCategorias(c);
    }
    public ArrayList<Categoria> lstCategorias(){
        return objCategoria.listarCategorias();
    }
    public String regCategoria(Categoria c){
        return objCategoria.registrarCategoria(c);
    }
    public String editarCategoria(Categoria c){
        return objCategoria.actualizarCategoria(c);
    }
    public String eliminarProducto(Categoria c){
        return objCategoria.eliminar(c);
    }
    
}
    
    

