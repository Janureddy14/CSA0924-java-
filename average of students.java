import java.util.*;
public class Average_of_15_Students {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i;
        int avg, sum=0;
        int a[]=new int[15];
        System.out.println("Enter Each Student Marks:");
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(i+1)+" Marks:");
            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        avg=sum/ a.length;
        System.out.println("Sum is = "+sum);
        System.out.println("Average is ="+avg);
    }
}
