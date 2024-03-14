package Concepts.Overriding;

public class Prac01 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();
        System.out.println("SBI Bank rate of Interest: " + sbi.getrateofinterest());
        System.out.println("ICICI Bank rate of Interest: " + icici.getrateofinterest());
        System.out.println("HDFC Bank rate of Interest: " + hdfc.getrateofinterest());

    }


}
