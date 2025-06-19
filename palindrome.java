
public class palindrome {
    public static void main(String[] args) {
        int num=12321;
        int reverse=0;
        int temp=num;
        while (num!=0) {
            int digit = num%10;
            reverse = reverse*10+digit;
            num=num/10;
        }   
        if(temp==reverse) 
        {
            System.out.println("is palindrome!");
        }
        else
        {
            System.out.println("not palindrome.");
        }
}    

}
