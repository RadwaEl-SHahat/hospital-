package clinic;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Patient {
    int ID;
    String firstName;
    String  lastName;
    int age;
    String Title;
    String Address;
    int phonenumber;
    String Gender;
    String disease;

    public Patient(int ID, String firstName, String lastName, int age , String address, int phonenumber, String gender, String disease) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        Address = address;
        this.phonenumber = phonenumber;
        Gender = gender;
        this.disease = disease;
    }

    public Patient(String firstName, String lastName, int age, String address, int phonenumber, String gender, String disease) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        Address = address;
        this.phonenumber = phonenumber;
        Gender = gender;
        this.disease = disease;
    }

    public Patient() {
    }


    public boolean add_patient(Patient p){
        boolean flag=false;
        try{
            Connection con = DBConnection.createConnection();
            String query="insert into patient(firstname,lastname,age,address,phonenumber,gender, disease) value(?,?,?,?,?,?,?)";
            PreparedStatement pst =con.prepareStatement(query);
            pst.setString(1,p.getFirstName());
            pst.setString(2,p.getLastName());
            pst.setInt(3,p.getAge());
            pst.setString(4,p.getAddress());
            pst.setInt(5,p.getPhoneNumber());
            pst.setString(6,p.getGender());
            pst.setString(7,p.getDisease());
            pst.executeUpdate();
            flag=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean delete_patient(int id) {
        {boolean flag=false;
            try {
                Connection con = DBConnection.createConnection();
                String  query="delete from patient where Id="+id;
                PreparedStatement pst =con.prepareStatement(query);
                pst.executeUpdate();
                flag=true;
            }
            catch (Exception e)
            {
            e.printStackTrace();
            }
            return flag;
        }

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

    public int getPhoneNumber() {
        return phonenumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phonenumber = phonenumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}


