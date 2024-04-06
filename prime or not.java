import java.util.*;
class PrimeNumber{
    public static void main(String[] args)
    {
        int n, m=0, i, flag=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=s.nextInt();
        m=n/2;
        if(n==0 || n==1|| n==4)
        {
            System.out.printf("%d is Not a Prime Number",n);
        }
        else{
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.printf("%d is Not a Prime Number",n);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.printf("%d is a Prime Number",n);
            }
        }
    }
}
