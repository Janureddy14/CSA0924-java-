import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num;
        num=s.nextInt();
        if(num%2==0)
        {
            System.out.printf("The number %d is EVEN",num);
        }
        else
        {
            System.out.printf("The number %d is ODD",num);
        }
    }
}
