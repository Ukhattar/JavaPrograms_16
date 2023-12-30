package src2;

public class Ndaysinmonth {
    public static void main(String[] args) {
        //31 days = jan,march,may,july,aug,oct,dec
        //30days = apr,june,sep,nov
        //28days = feb
        String monthname = "Frr";

       // int month = 7;
        switch (monthname)
        {
            case "Jan","Mar","May","Jul","Aug","oct","dec":
            System.out.println("31 days");
            break;

            default:
                System.out.println("Invalid Month");
                break;
        }
    }
}
