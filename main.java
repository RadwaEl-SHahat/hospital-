package clinic;
import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Patient p =new Patient();
        Doctor d= new Doctor() ;
        Resiptionist r = new Resiptionist();
        Bill b=new Bill();
        System.out.println("enter 1 for doctor ,2 for patient, 3 for Resiptionist ,4 for generting bill,5for delete");
        int a1 = scanner.nextInt();
        try {//doctor
            if (a1 == 1) {
                System.out.println("register or registered");
                String b1 = scanner.next();
                if (b1.equals("register")) {
                    System.out.println("Create Doctor");
                    System.out.println("Enter Doctor's First Name: ");
                    String firstName = scanner.next();
                    System.out.println("Enter Doctor's Last Name: ");
                    String lastName = scanner.next();
                    System.out.println("Enter Doctor's ID: ");
                    int ID = scanner.nextInt();
                    System.out.println("Enter Doctor's Age: ");
                    int Age = scanner.nextInt();

                    System.out.println("Enter Doctor's Address: ");
                    String address = scanner.next();
                    System.out.println("Enter Doctor's Phone Number: ");
                    int phoneNumber = scanner.nextInt();
                    System.out.println("Enter Doctor's Gender: ");
                    String gender = scanner.next();
                    System.out.println("Enter Doctor's Specialization: ");
                    String specialization = scanner.next();
                    System.out.println("Enter Doctor's Department: ");
                    String department = scanner.next();
                    d = new Doctor(ID, firstName, lastName, Age, address, phoneNumber, gender, specialization, department);

                    boolean d1 = d.add_doctor(d);
                  if (d1)
                       System.out.println("Done");
                   else {
                        System.out.println("try again");
                   }
                } else if (b1.equals("registered")) {
                    System.out.println("Enter Doctor's Phone Number:");
                    int phoneNumber = scanner.nextInt();
                    System.out.println("Enter Doctor's ID: ");
                    int ID = scanner.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("you have an error");
        } catch (Exception e) {
            System.out.println("you have an error try again");
        }

        //patient
        try {
            if (a1 == 2) {
                System.out.println("register or registered");
                String b2 = scanner.next();
                if (b2.equals("register")) {

                    System.out.println("Create Patient");
                    System.out.println("Enter Patient's First Name: ");
                    String PfirstName = scanner.next();
                    System.out.println("Enter Patient's Last Name: ");
                    String PlastName = scanner.next();
                    System.out.println("Enter Patient's Age: ");
                    int PAge = scanner.nextInt();
                    System.out.println("Enter Patient's Address: ");
                    String Paddress = scanner.next();
                    System.out.println("Enter Patient's Phone Number: ");
                    int PphoneNumber = scanner.nextInt();
                    System.out.println("Enter Patient's Gender: ");
                    String Pgender = scanner.next();
                    System.out.println("Enter Patient's Disease: ");
                    String Pdisease = scanner.next();
                    p = new Patient(PfirstName, PlastName, PAge, Paddress, PphoneNumber, Pgender, Pdisease);

                    boolean p1 = p.add_patient(p);
                   if (p1)
                        System.out.println("Done");
                   else {
                        System.out.println("try again");
                   }

                } else if (b2.equals("registered")) {
                    System.out.println("Enter Patient's Phone Number: ");
                    int PphoneNumber = scanner.nextInt();
                    System.out.println("Enter Patient's ID: ");
                    int PID = scanner.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("you have an error");
        } catch (Exception e) {
            System.out.println("you have an error try again");
        }

        //reception
        try {
            if (a1 == 3) {
                System.out.println("register or registered");
                String b3 = scanner.next();
                if (b3.equals("register")) {


                    System.out.println("Create Reciptionist:");
                    System.out.println("Enter Reciptionist's First Name: ");
                    String RfirstName = scanner.next();
                    System.out.println("Enter Reciptionist's Last Name: ");
                    String RlastName = scanner.next();
                    System.out.println("Enter Reciptionist's ID: ");
                    int RID = scanner.nextInt();
                    System.out.println("Enter Reciptionist's Age: ");
                    int Rage = scanner.nextInt();

                    System.out.println("Enter Reciptionist's Address: ");
                    String Raddress = scanner.next();
                    System.out.println("Enter Reciptionist's Phone Number: ");
                    int RphoneNumber = scanner.nextInt();
                    System.out.println("Enter Reciptionist's Gender: ");
                    String Rgender = scanner.next();

                    r = new Resiptionist(RID, RfirstName, RlastName, Rage, Raddress, RphoneNumber, Rgender);
                    boolean r1 = r.add_resiptionist(r);
                    if (r1)
                        System.out.println("Done");
                    else {
                        System.out.println("try again");
                    }
                } else if (b3.equals("registered")) {
                    System.out.println("Enter Patient's Phone Number: ");
                    int RphoneNumber = scanner.nextInt();
                    System.out.println("Enter Patient's ID: ");
                    int RID = scanner.nextInt();

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("you have an error");
        } catch (Exception e) {
            System.out.println("you have an error try  again");
        }
        try {
            if (a1 == 4) {
                System.out.println("Enter Patient firstName");
                String Pfname = scanner.next();
                System.out.println("Enter Patient secondName");
                String Plname = scanner.next();
                System.out.println("Enter age: ");
                int page = scanner.nextInt();
                System.out.println("Enter Address ");
                String padd = scanner.next();
                System.out.println("Enter phone number: ");
                int phonep = scanner.nextInt();
                System.out.println("Enter gender: ");
                String gp = scanner.next();
                System.out.println("Enter Total Price: ");
                int price = scanner.nextInt();
                System.out.println("Enter receptionist first Name");
                String RfirstName = scanner.next();
                System.out.println("Enter receptionist LastName");
                String RlastName = scanner.next();

                b = new Bill(Pfname, Plname, page, padd, phonep, gp, price, RfirstName, RlastName);
                boolean b1 = b.add_bill(b);
                if (b1)
                    System.out.println("Done");
                else {
                    System.out.println("try again");
                }

            }
            }catch(InputMismatchException e1){
                System.out.println("you have an error");
            }
                catch(Exception e){
                System.out.println("you have an error try  again");
            }
        //delete patient
try{
if(a1==5) {
    System.out.println("enter patient id to delete");
    int dd = scanner.nextInt();
boolean ff = p.delete_patient(dd);
if (ff){
    System.out.println("Patient deleted");
}
else System.out.println("Failed, try again");
}
    }catch (InputMismatchException e2){
    System.out.println("enter id again");
    }
}
}