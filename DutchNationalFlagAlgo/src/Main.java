import java.util.*;

class DNF{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[6];

        System.out.println("Enter 6 inputs digits in the array");

        int length = array.length;

        for(int i=0;i<6;i++)
        {
            array[i]=sc.nextInt();
        }

        int low=0,mid=0,high=length-1;

        while(mid<=high)
        {
                if(array[mid]==0)
                {
                    int temp=array[mid];
                    array[mid]=array[low];
                    array[low]=temp;

                    mid++;
                    low++;
                }
                else if(array[mid]==1)
                {
                    mid++;
                }
                else {
                    int temp=array[high];
                    array[high]=array[mid];
                    array[mid]=temp;
                    high--;

                }

        }

        for(int i=0;i<length;i++)
        {
            System.out.println(array[i]);
        }


    }
}