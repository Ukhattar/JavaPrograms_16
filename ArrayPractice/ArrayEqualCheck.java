package ArrayPractice;

public class ArrayEqualCheck {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};

        boolean result;
      result = checkArrayequals(arr1,arr2);
      if(result==true)
      {
          System.out.println("Arrays are equal");
      }
      else
      {
          System.out.println("Arrays are not equal");
      }


    }



    public static boolean checkArrayequals(int[] arr1, int[] arr2)
    {
        boolean flag = true;
        if(arr1.length == arr2.length)
        {
            //if length is equals, check element
            for(int i =0;i<=arr1.length-1;i++)
            if(arr1[i] != arr2[i])
            {
                flag = false;
            }
        }
        else
        {
            flag = false;
        }


        return flag;
    }


}
