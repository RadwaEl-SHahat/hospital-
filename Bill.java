package clinic;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Bill {

    String PfirstName;
    String PlastName;
    int age;
    String Address;
    int phoneNumber;
    String Gender;
    int price;
    String Rfirstname;
    String Rlastname;

    public Bill(String pfirstName, String plastName, int age, String address, int phoneNumber, String gender, int price, String rfirstname, String rlastname) {
        PfirstName = pfirstName;
       this.PlastName = plastName;
        this.age = age;
        Address = address;
        this.phoneNumber = phoneNumber;
        Gender = gender;
        this.price = price;
        Rfirstname = rfirstname;
        Rlastname = rlastname;
    }

    public Bill() {
    }
    public boolean add_bill(Bill b){
        boolean flag=false;
        try{
            Connection con = DBConnection.createConnection();
            String query="insert into bill (PfirstName,  PlastName, age,  address,  phoneNumber,  gender, price,  rfirstname, rlastname) value (? , ? ,? ,? ,? ,? ,? ,? ,? ,? )";
            PreparedStatement bst =con.prepareStatement(query);
            bst.setString(1,b.getPfirstName());
            bst.setString(2,b.getPlastName());
            bst.setInt(3,b.getAge());
            bst.setString(4,b.getAddress());
            bst.setInt(5,b.getPhoneNumber());
            bst.setString(6,b.getGender());

            bst.setInt(8,b.getPrice());
            bst.executeUpdate();
            flag=true;

        }catch(Exception e){
            e.printStackTrace();
        }

        return flag;

    }

    public String getPfirstName() {
        return PfirstName;
    }

    public void setPfirstName(String pfirstName) {
        PfirstName = pfirstName;
    }

    public String getPlastName() {
        return PlastName;
    }

    public void setPlastName(String plastName) {
        PlastName = plastName;
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
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRfirstname() {
        return Rfirstname;
    }

    public void setRfirstname(String rfirstname) {
        Rfirstname = rfirstname;
    }

    public String getRlastname() {
        return Rlastname;
    }

    public void setRlastname(String rlastname) {
        Rlastname = rlastname;
    }
}