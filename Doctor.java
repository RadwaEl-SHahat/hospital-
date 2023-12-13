package clinic;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Doctor {
    int ID;
    String firstName;
    String lastName;
    int age;

    String Address;
    int phonenumber;
    String Gender;
    String Specialization;
    String Department;

    public Doctor(int ID, String firstName, String lastName, int age, String address, int phonenumber, String gender, String specialization, String department) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        Address = address;
        this.phonenumber = phonenumber;
        Gender = gender;
        Specialization = specialization;
        Department = department;
    }

    public Doctor(String firstName, String lastName, int age,  String address, int phonenumber, String gender, String specialization, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        Address = address;
        this.phonenumber = phonenumber;
        Gender = gender;
        Specialization = specialization;
        Department = department;
    }

    public Doctor() {
    }

    public boolean add_doctor(Doctor d){
        boolean flag =false;
        try {
            Connection con = DBConnection.createConnection();
            String query="insert into doctor_database (firstname,lastname,age,address,phonenumber,gender, specialization,department) value(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement dst =con.prepareStatement(query);
            dst.setString(1,d.getFirstName());
            dst.setString(2,d.getLastName());
            dst.setInt(3,d.getAge());
            dst.setString(4,d.getAddress());
            dst.setInt(5,d.getphonenumber());
            dst.setString(6,d.getGender());
            dst.setString(7,d.getSpecialization());
            dst.setString(8,d.getDepartment());
            dst.executeUpdate();
            flag=true;
    }
    catch(Exception e){
        e.printStackTrace();
    }

        return flag;

}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getphonenumber() {
        return phonenumber;
    }

    public void setphonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}


