import java.util.*;
class ReverseNum{
    public static int reverse(int n)
    {
        int rev=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number to reverse:");
        n=s.nextInt();
        System.out.println("Reverse of given number is = "+reverse(n));
    }
}
