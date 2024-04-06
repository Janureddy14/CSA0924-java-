import java.util.*;
class HelloWorld{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st number:");
        a=s.nextInt();
        System.out.println("Enter 2nd number:");
        b=s.nextInt();
        c=a+b;
        System.out.println("Output = "+c);
    }
}
