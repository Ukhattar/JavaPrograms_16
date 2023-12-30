package src2;

public class SummationProg {
    public static void main(String[] args) {
//        //print 1/2+2/3+3/4+5/6--
//        //count = for loop, sum is also there = sum + i
        float sum = 0;
//        for(int i=1;i<=4;i++)
//        {
//            sum = sum + (float)i/(i+1);
//        }
//        System.out.println(sum);


        // print 1*1 + 2*2 + 3*3
        for(int i =1;i<=3;i++)
        {
            sum = sum + (i*i);
        }
        System.out.println(sum);
    }
}
