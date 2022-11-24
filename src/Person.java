public class Person {


    // Id, firstName, lastName, age, email, phoneNumber.
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setAge(int age) {
        if (age < 0 || age > 127) {
            System.out.println("Жаш туура эмес берилип жатат !");
            return;
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {

        if (email.indexOf("@") == -1) {
            System.out.println("Email туура эмес, «@» жок !");
            return;
        }

        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) {
            System.out.println("Телефон номуру туура эмес !");
            return;}

        if (phoneNumber.indexOf("+996") != '0') {
            System.out.println("Телефон номуру туура эмес !");
            return;
        }


        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }







    public void placeOfWork(){
        System.out.println("works at the company");
    }


}
