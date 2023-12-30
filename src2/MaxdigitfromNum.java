package src2;

public class MaxdigitfromNum {
    public static void main(String[] args) {
        // I/P - 8769 O/P -9
        // to seperate digit num % 10

        int num = 87656;
        int max = num % 10;
        while(num!=0)
        {
            if(num%10>max)
            {
               max = num % 10;
            }
           num = num/10;

        }
        System.out.println(max);
//        num = 87656, max = 6 (initialized with the last digit)
//        Loop begins:
//        Iteration 1: num % 10 (current digit) is 6. Since 6 is not greater than 6 (max), no update to max.
//                Move to the next digit: num = num / 10 becomes num = 8765.
//        Iteration 2: num % 10 (current digit) is 5. Since 5 is less than 6 (max), no update to max.
//                Move to the next digit: num = num / 10 becomes num = 876.
//        Iteration 3: num % 10 (current digit) is 6. Since 6 is not greater than 6 (max), no update to max.
//                Move to the next digit: num = num / 10 becomes num = 87.
//        Iteration 4: num % 10 (current digit) is 7. Since 7 is greater than 6 (max), max gets updated to 7.
//        Move to the next digit: num = num / 10 becomes num = 8.
//        Iteration 5: num % 10 (current digit) is 8. Since 8 is greater than 7 (max), max gets updated to 8.

    }
}
