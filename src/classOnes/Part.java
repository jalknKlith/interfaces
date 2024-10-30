package classOnes;
import java.util.Date;

    //ATTRIBUTES
public class Part {
    public String code;
    public String date;
    public String client;
    public double ram;
    public double usb;
    public double gpu;
    public double mouse;
    public double hdd;
    public double led;
    public double shipping;
    public double discount;
    public double subtotal;
    public double tax;
    
    //CONSTRUCTORS
    public Part() {
    }

    public Part(String code, String date, String client, double ram, double usb, double gpu, double mouse, double hdd, double led, double shipping, double discount, double subtotal, double tax) {
        this.code = code;
        this.date = date;
        this.client = client;
        this.ram = ram;
        this.usb = usb;
        this.gpu = gpu;
        this.mouse = mouse;
        this.hdd = hdd;
        this.led = led;
        this.shipping = shipping;
        this.discount = discount;
        this.subtotal = subtotal;
        this.tax = tax;
    }
    
     //GETTERS
    
    public String getCode() {
        return code;
    }

    public String getDate() {    
        return date;
    }

    public String getClient() {
        return client;
    }

    public double getRam() {
        return ram;
    }

    public double getUsb() {
        return usb;
    }

    public double getGpu() {
        return gpu;
    }

    public double getMouse() {
        return mouse;
    }

    public double getHdd() {
        return hdd;
    }

    public double getLed() {
        return led;
    }

    public double getShipping() {
        return shipping;
    }

    public double getDiscount() {
        return discount;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTax() {
        return tax;
    }

    //SETTERS

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public void setUsb(double usb) {
        this.usb = usb;
    }

    public void setGpu(double gpu) {
        this.gpu = gpu;
    }

    public void setMouse(double mouse) {
        this.mouse = mouse;
    }

    public void setHdd(double hdd) {
        this.hdd = hdd;
    }

    public void setLed(double led) {
        this.led = led;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    //METHODS
    //Making the invoice adding the values
    public String makeBill(){
        return "Invoice #: "+this.code+"\n"+
                this.date+"\n"+
                "Client: "+this.client+"\n"+
                "Shipping: $"+this.shipping+"\n"+
                "Subtotal: $"+this.subtotal+"\n"+
                "Discount: $"+this.discount+"\n"+
                "Taxes: $"+this.tax+"\n"+
                "Total: $"+(this.shipping+this.subtotal)+"\n";
        
    }
    
    //Calculating discount 3%
    public double discount3(){
        return this.subtotal*0.03;
    }
    
    //Calculating discount 5%
    public double discount5(){
        return this.subtotal*0.05;
    }
    
    //Adding shipping 
    public String shipping(){
        return "10000";
    }
    //Adding takeAway 
    public String pickUp(){
        return "0";
    }
    
    //calculating the tax
    public double tax(){
        return (this.subtotal-this.discount)*1.19;
    }
    
    //calculating the total
    public double totalBill(){
        return ((this.subtotal-this.discount)*1.19)+this.shipping;
    }
    
    //setting the date
    public String printDate() {
        Date date = new Date();
        return ""+date;
    }

    //setting the invoice number
    
}
