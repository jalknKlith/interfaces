package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public String db = "javadbmvnoche"; //nombre de la base de datos
    public String url = "jdbc:mysql://localhost:3306/"; //nombre de la conexion
    public String user = "root"; //nombre de usuario
    public String password = ""; //
    public String driver = "com.mysql.cj.jdbc.Driver"; //
    public Connection cn;
    
    /*probar la conexion

    public String conectarTest(){
        String res ="";
        //try catch
        
        try {
            Class.forName(this.driver);
            this.cn = DriverManager.getConnection(this.url+this.db, this.user, this.password);
            if (this.cn != null){
                res = "conexion exitosa";
            }
        } catch (ClassNotFoundException | SQLException ex) {
            res = "Conexion fallida: "+ex.getMessage();
        }
        return res;
        
    }
    */
    //metodo de conexion
    public Connection conectar(){
        try {
            Class.forName(this.driver);
            this.cn = DriverManager.getConnection(this.url+this.db, this.user, this.password);
            
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return this.cn;
    }
    
}
