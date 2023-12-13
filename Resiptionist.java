package clinic;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Resiptionist {


    int ID;
    String firstName;
    String  lastName;
    int age;

    String Address;
    int phonenumber;
    String Gender;

    public Resiptionist(int ID, String firstName, String lastName, int age,  String address, int phonenumber, String gender) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        Address = address;
        this.phonenumber = phonenumber;
        Gender = gender;
    }

    public Resiptionist(String firstName, String lastName, int age,  String address, int phonenumber, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        Address = address;
        this.phonenumber = phonenumber;
        Gender = gender;
    }

    public Resiptionist() {
    }
    public boolean add_resiptionist(Resiptionist r){
        boolean flag =false;
        try {
            Connection con = DBConnection.createConnection();
            String query="insert into resiptionist (firstname,lastname,age,address,phonenumber,gender) value(?,?,?,?,?,?)";
            PreparedStatement rst =con.prepareStatement(query);
            rst.setString(1,r.getFirstName());
            rst.setString(2,r.getLastName());
            rst.setInt(3,r.getAge());
            rst.setString(4,r.getAddress());
            rst.setInt(5,r.getphonenumber());
            rst.setString(6,getGender());
            rst.executeUpdate();
            flag=true;
        }catch (Exception e){
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
}



