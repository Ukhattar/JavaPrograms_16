package PracticePrograms2;

public class Prac012_Countnumberofdigitfronnum {
    public static void main(String[] args) {
        int number = 734360876;
        int count =0;
        int countdigit;
        while (number!=0)
        {
            countdigit = number%10;
            count++;
            number = number/10;
        }
        System.out.println(count);
    }
}
