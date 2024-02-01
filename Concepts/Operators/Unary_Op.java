package Concepts.Operators;

public class Unary_Op {
    public static void main(String[] args) {
         int a = 10;
         int b = 11;
        System.out.println(a++); // Post increment fist assign the value to a and then it increments, now a should be 11
        System.out.println(a); // a = 11
        System.out.println(a++ + ++a + a + a++);
        //a++                 +    ++a + a + a++
        // 11,then inc        +  a is 12, increase then add a = 13   +  a=13 + a=13,thenicrement
        // a++ + ++a + a + a++ = 11+ 13+13+13 = 50
        //a=11, and then increment now a becomes 12
        //a++ = 12
        System.out.println(a);
        //a=14
    }
}
