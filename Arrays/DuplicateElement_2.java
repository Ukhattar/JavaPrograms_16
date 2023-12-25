package Arrays;

public class DuplicateElement_2 {
    public static void main(String[] args) {
        //Approach 2
        boolean flag = false;
        String arr[] = {"Java","C++","C","Python","Java"};
        for(int i=0; i<=arr.length-1;i++)
        {
            for(int j =i+1; j<=arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate array");
                    break;
                }
            }
        }

    }
}
