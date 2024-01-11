package PracticePrograms2;

public class Prac007_MaxDigitfromNum {
    public static void main(String[] args) {
        int num = 38465;
        int digit;
        int last_digit = num %10; //5
        int max = 0;
        while(num!=0)
        {
        digit = num % 10; // 5 //6
        if(digit>=last_digit) // 5>=5,Y ? // 6>=5, Y ?  
        {
            max = digit;
        }
         num = num/10;   
        }
        System.out.println(max);
    }
   
}
