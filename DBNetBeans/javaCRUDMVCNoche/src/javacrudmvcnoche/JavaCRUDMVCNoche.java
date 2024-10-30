package javacrudmvcnoche;
import config.Conexion;

public class JavaCRUDMVCNoche {

    public static void main(String[] args) {
        
        Conexion objConexion = new Conexion();
        System.out.println(objConexion.conectar());
        
        
    }
    
}
