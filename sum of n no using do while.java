import java.util.*;
class MyProgram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i;
        int sum=0;
        System.out.print("Enter the number:");
        n=s.nextInt();
        i=0;
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.printf("The sum of given %d numbers is = %d",n,sum);
    }
}
