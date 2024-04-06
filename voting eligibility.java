import java.util.*;
class Voting{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int age,elg;
        System.out.print("Enter your AGE:");
        age=s.nextInt();
        elg=18-age;
        if(age>=18)
        {
            System.out.println("You are Eligible for Voting\n");
        }
        else if(age<18)
        {
            System.out.printf("You are Not Eligible for Voting\nYou'll be eligilble after %d Years\n",elg);
        }
        else if(age<=0)
        {
            System.out.println("Enter a Valid AGE\n");
        }
    }
}
