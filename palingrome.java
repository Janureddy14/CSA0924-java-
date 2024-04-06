import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.print("Enter Choice=1 for Number\nEnter Choice=2 for String\n");
        System.out.print("Enter your choice:");
        choice=s.nextInt();
        System.out.print("Enter the string: ");
        String value = s.next();
        switch(choice){
            case 1:
                int num = Integer.parseInt(value);
                int rev = 0,rem,num2=num;
                while(num!=0){
                    rem = num%10;
                    rev = rev*10+rem;
                    num = num/10;
                }
                if(num2==rev)
                    System.out.println("the number is palindrome");
                else
                    System.out.println("the number is not a polindrome");
                break;
            case 2:
                StringBuffer s1 = new StringBuffer(value);
                s1.reverse();
                String s2 = s1.toString();
                if (value.equals(s2))
                    System.out.println("the strings are pallindrome");
                else
                    System.out.println("the strings are not pallindrome");
                break;
            default:
                System.out.print("Enter a valid choice:");
        }
    }
}
