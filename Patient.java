
import java.util.Scanner;


public class Patient {
    int id;
    String PIB;
    String adress;
    int phone;
    int medical_card;
    String diagnoz;

    public void setPatient(int id, String PIB,String adress, int phone, int medical_card, String diagnoz)	{
        this.id=id;
        this.PIB=PIB;
        this.adress=adress;
        this.phone=phone;
        this.medical_card=medical_card;
        this.diagnoz=diagnoz;


    }
    public void setPatient1() {
        Scanner sc = new Scanner (System.in);
        int id=sc.nextInt();
        String PIB=sc.next();
        String adress=sc.next();
        int phone=sc.nextInt();
        int medical_card=sc.nextInt();
        String diagnoz=sc.next();
    }
    public Patient getPatient() {
        return this;
    }
    Patient(){}
    Patient(int id, String PIB,String adress, int phone, int medical_card, String diagnoz)	{
        setPatient( id,  PIB, adress, phone, medical_card, diagnoz);
    }
    public String getDiagnoz() {
        return diagnoz;
    }
    public int getMedical() {
        return medical_card    ;
    }

}

