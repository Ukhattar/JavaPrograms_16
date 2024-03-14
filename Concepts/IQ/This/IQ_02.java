package Concepts.IQ.This;

public class IQ_02 {
    //Can I give value to reference variabe this -> Answer is NO

    IQ_02()
    {
       // this = null;
        //it refers to the current class object and it is final reference in java
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {

        IQ_02 iq02 = new IQ_02();
    }
}
