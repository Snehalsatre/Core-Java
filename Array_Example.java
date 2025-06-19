import java.util.Scanner;

public class Array_Example
{
    public static void main(String[] args)
    {
        // int[] arr= new int[3];
        // arr[0]=10;
        // arr[1]=20; 
        // arr[2]=30;
        // System.out.println("First element: "+arr[0]+"\nsecond: "+arr[1]+"\nthird: "+arr[2]);
       
        Scanner sc = new Scanner(System.in);
        int []number = new int[4];
        for(int i=0;i<4;i++)
        {
            number[i]=sc.nextInt();

        }
        for (int i=0;i<4;i++)
        {
        System.out.print (number[i]+" ");
        }
        System.out.print("\nEnter for a number to be search: ");
        int num=sc.nextInt();
        boolean found=false;
        for(int i=0;i<4;i++)
        {
            if(number[i]==num)
            {
                System.out.println("number "+num+" found at index "+i);
                found=true;
            }
            
        }
        if(! found)
      {
            System.out.println("not found");
        }

        
        
    }
}