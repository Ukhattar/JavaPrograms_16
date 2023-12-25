package Arrays;

public class OddEvenfromArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        //print even and odd
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0)
            {
                System.out.println("Even elements in Array are: " + arr[i]);
            }
            else
            {
                System.out.println("Odd elements in Array are: " + arr[i]);
            }

        }
    }
}
