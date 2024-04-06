import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=s.nextInt();
        if(num<0)
        {
            System.out.printf("Given number %d is a negative number\n",num);
        }
        else if(num==0)
        {
            System.out.printf("Given number %d is zero\n",num);
        }
        else if(num>0)
        {
            System.out.printf("Given number %d is a positive number\n",num);
        }
    }
}
