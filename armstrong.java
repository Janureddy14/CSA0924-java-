import java.util.*;
class ArmstrongNum{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,temp,r,sum=0;
        System.out.print("Enter a number:");
        n=s.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(temp==sum)
        {
            System.out.print("It is a Armstrong Number");
        }
        else{
            System.out.print("It is not a Armstrong Number");
        }
    }
}
