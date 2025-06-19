
public class mainn{
    

    public static void main(String[] args)
    {
        int num=12345;
        int flag=0;
        System.out.println(num);
        for(int i=0;i<5;i++)
        {
            num=num%10;
            flag++;

        }
        System.out.println("Number of digits present in "+num+" is "+flag);
    }
   
}

