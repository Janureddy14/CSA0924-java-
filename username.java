import java.util.*;
class Username{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String Username1, Username2;
        System.out.print("Enter the Username1:");
        Username1=s.nextLine();
        System.out.print("Enter the Username2:");
        Username2=s.nextLine();
        if(Username1.equals(Username2))
        {
            System.out.print("Username is Valid");
        }
        else{
            System.out.print("Username is Invalid");
        }
    }
}
