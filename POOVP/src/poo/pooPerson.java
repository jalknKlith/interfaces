package poo;
import classOnes.Person;

public class pooPerson {

    public static void main(String[] args) {
        //
        Person objPerson;
        objPerson = new Person();
        objPerson.setId("335566");
        objPerson.setName("John");
        objPerson.setSurname("Steward");
        objPerson.setEmail("johnstew@gmail.com");
        objPerson.setAddress("Street 80");
        objPerson.setAge(16);

        System.out.println("\n"+"PERSON'S DATE");
        System.out.println("-------------------------------");
        System.out.println("ID: " + objPerson.getId());
        System.out.println("NAME: " + objPerson.getName());
        System.out.println("SURNAME: " + objPerson.getSurname());
        System.out.println("EMAIL: " + objPerson.getEmail());
        System.out.println("ADDRESS: " + objPerson.getAddress());
        objPerson.validateAge();
        System.out.println(objPerson.validateGender("M"));
        System.out.println("-------------------------------");



    }
}
