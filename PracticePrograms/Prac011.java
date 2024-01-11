package PracticePrograms;

public class Prac011 {
    public static void main(String[] args) {
        //TakeMaximunDigitfrom a Number
        //I/P = 645382 O/P = 8
        int num = 64538290;
        int lastdigit;
        int maxdigit = 0;
        while(num!=0)
        {
            lastdigit = num % 10; // 2 // 8 // 3
            if(lastdigit>maxdigit) // is 2>0? Y // 8>2? Y
            {
                maxdigit = lastdigit; // max =2 // max = 8
            }
            num = num/10; // 64538 // 6453
        }
        System.out.println(maxdigit);
    }
}
