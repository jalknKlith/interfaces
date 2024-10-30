package classOnes;

public class Operator {
    //Attributes
    public double number1;
    public double number2;
    public double result;
    
    //Constructors
    
     public Operator() {
    }

    public Operator(double nUmero1, double numero2, double resultado) {
        this.number1 = nUmero1;
        this.number2 = numero2;
        this.result = resultado;
    }
    
    //getters

    public double getnUmero1() {
        return number1;
    }

    public double getNumero2() {
        return number2;
    }

    public double getResultado() {
        return result;
    }
    
    //setters

    public void setNumero1(double nUmero1) {
        this.number1 = nUmero1;
    }

    public void setNumero2(double numero2) {
        this.number2 = numero2;
    }

    public void setResultado(double resultado) {
        this.result = resultado;
    }
    
    //Metodos
    
    public void sumar(){
        this.result = this.number + this.number;
    }
    
    public void restar(){
        this.resultado = this.numero1 - this.numero2;
    }
    
    public void multiplicar(){
        this.resultado = this.numero1 * this.numero2;
    }
    
    public void dividir(){
        this.resultado = this.numero1 / this.numero2;
    }
    
    public void potenciar(){
        this.resultado = Math.pow(numero1, numero1);
    }
    
    
    
}
