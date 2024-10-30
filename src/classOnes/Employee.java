package classOnes;

public class Employee {
    
    //ATTRIBUTES
    String ID;
    String name;
    String surname;
    String nat;
    String gender;
    String civil;
    
    //CONSTRUCTORS
    public Employee() {
    }

    public Employee(String ID, String name, String surname, String nat, String gender, String civil) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.nat = nat;
        this.gender = gender;
        this.civil = civil;
    }
    
    //GETTERS
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNat() {
        return nat;
    }

    public String getGender() {
        return gender;
    }

    public String getCivil() {
        return civil;
    }
    
    //SETTERS
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }
    
    //METHOD
    //Adding the values
    public String add() {
        return  "ID: "+ this.ID+"\n"+
                "Name: "+ this.name + "\n"+
                "Surname: "+ this.surname + "\n"+
                "Nationality: "+ this.nat + "\n"+
                "Gender: "+ this.gender + "\n"+
                "Is: "+ this.civil+ "\n";
                
    }
  
}
