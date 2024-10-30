package classOnes;

public class Employee {
    //Atributos
    public String documento;
    public String nombre;
    public String apellido;
    public String nacionalidad;
    public String genero;
    public String estadoCivil;
    
    //Constructores
    public Employee() {
    }

    public Employee(String documento, String nombre, String apellido, String nacionalidad, String genero, String estadoCivil) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }
    
    //getters
    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    //setters
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    //metodo
    public String agregarEmpleado(){
        return "Documento: "+this.documento+"\n"+
                "Nombre: "+this.nombre+"\n"+
                "Apellido: "+this.apellido+"\n"+
                "Nacionalidad: "+this.nacionalidad+"\n"+
                "Genero: "+this.genero+"\n"+
                "Estado Civil: "+this.estadoCivil+"\n";
    }
    
}
