package classOnes;

public class Person {
    //attribute
    public String id;
    public String name;
    public String surname;
    public String phone;
    public String email;
    public String address;
    public int age;

    //void constructor
    public Person() {
    }

    //GETTERS
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    //SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //METHOD NO RETURN

    public void validateAge() {
        if (18 <= this.age) {
            System.out.println(this.name + " "
                    + this.surname + " is an adult");
        } else {
            System.out.println(this.name + " "
                    + this.surname + " is not an adult");
        }
    }

    public String validateGender(String gender) {
        String answer="";
        if (gender.equals("F") || gender.equals("f")){
            answer = "She is a female";
        } else if (gender.equals("M") || gender.equals("m")) {
            answer = "He is a male";
        }
        return answer;
    }

}