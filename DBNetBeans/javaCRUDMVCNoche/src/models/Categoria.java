package models;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import config.Conexion;
import java.util.ArrayList;

public class Categoria extends Conexion{
    public int idCategoria;
    public String nombre;
    public int estado;
    
    //constructores

    public Categoria() {
    }

    public Categoria(int idCategoria, String nombre, int estado) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    //getters

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstado() {
        return estado;
    }
    
    //setters

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    //metodos

    @Override
    public String toString() {
        return this.nombre;
    }
    
    //metodo para llenar las categorias
    
    public void getCategorias(JComboBox c){
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        c.setModel(modeloCombo);
        try {
            Statement stm = conectar().createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM categorias;");
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setEstado(rs.getInt("estado"));
                modeloCombo.addElement(categoria);
                
            }
        } catch (SQLException e) {
            
        }
        
    }
    
    //resgistrar categoria
    public ArrayList<Categoria> listarCategorias(){
        String query = "SELECT * FROM categorias;";
        ArrayList<Categoria> tablaCategorias = new ArrayList<>();
        try {
            Statement stm = conectar().createStatement();//permite preparar la consulta
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Categoria objCat = new Categoria();
                objCat.setIdCategoria(rs.getInt("idCategoria"));
                objCat.setEstado(rs.getInt("estado"));
                objCat.setNombre(rs.getString("nombre"));
                tablaCategorias.add(objCat);
            }
            this.cn.close();//cerrar la conexion
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return tablaCategorias;
    }
    
    //metodo de registrar
    
    public String registrarCategoria(Categoria c){
        String query = "INSERT INTO categorias(idCategoria, estado, nombre)"
                        +"VALUES("+c.getIdCategoria()+", "+c.getEstado()+",'"+c.getNombre()+"');";
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
    public String actualizarCategoria(Categoria c){
        String query = "UPDATE productos SET nombre='"+c.getNombre()+"',"
                       +"precio="+c.getEstado()+" "
                       + "WHERE idCategoria="+c.getIdCategoria();
                        
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
    
    //metodo eliminar categoria
    public String eliminar(Categoria c){
        String query = "DELETE FROM categorias WHERE idCategoria = "+c.getIdCategoria();
                        
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
    
    
    //metodo para llenar el estado
    
    public void getEstado(JComboBox est){
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        est.setModel(modeloCombo);
        try {
            Statement stm = conectar().createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM categorias;");
            while(rs.next()){
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idCategoria"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setEstado(rs.getInt("estado"));
                modeloCombo.addElement(categoria);
                
            }
        } catch (SQLException e) {
            
        }
        
    }}


    

    
    