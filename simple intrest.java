import java.util.*;
class SimpleInterest{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int si, p, r, t;
        boolean isSenior;
        System.out.println("Enter the Principal amount:");
        p=s.nextInt();
        if(p<0)
        {
            System.out.println("Enter a valid Principal Amount");
        }
        else{
            System.out.println("Are you a senior citizen(True or False):");
            isSenior=s.nextBoolean();
            if(isSenior)
            {
                System.out.println("Rate of interest is 12%");
                r=12;
            }
            else{
                System.out.println("Rate of interest is 10%");
                r=10;
            }
            System.out.println("Enter the Time Period:");
            t=s.nextInt();
            if(t<0)
            {
                System.out.println("Enter a valid Time Period");
            }
            else{
                si=(p*r*t)/100;
                System.out.printf("The Simple Interest is %d",si);
            }
        }
    }
}
