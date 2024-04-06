import java.util.*;
class Account{
    int ib=0, cb, add, wd, pen=0, intr, choice, roi, t;
    Account()
    {
        cb=ib;
        Scanner s=new Scanner(System.in);
        System.out.print("Your Initial Balance is:"+ib+"\n");
        while(choice!=4) {
            System.out.print("1.ADD Money\n2.Withdraw Money\n3.Balance Enquiry\n4.Exit\n");
            System.out.print("Choose your choice:");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Money to add:");
                    add = s.nextInt();
                    cb = cb + add;
                    break;
                case 2:
                    System.out.print("Enter the Money to withdraw:");
                    wd = s.nextInt();
                    if (wd > cb) {
                        pen = 5;
                        System.out.println("You cannot withdraw more amount than your current balance\n");
                        System.out.println("You have to pay Penalty of "+pen+" rupees!!");
                        cb=cb-pen;
                        System.out.println("Your current balance is : "+cb);
                    } else {
                        cb = cb - wd;
                    }
                    break;
                case 3:
                    System.out.println("Your current Balance is = " + cb);
                    break;
                case 4:
                    System.out.print("Exiting the program!! Thank you.\n");
                    break;
                default:
                    System.out.print("Enter a valid Choice!!");
            }
        }
    }
    void interest(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your Interest rate:");
        roi=s.nextInt();
        System.out.print("Enter the Time Period:");
        t=s.nextInt();
        intr=(roi*cb*t)/100;
        System.out.println("You'll get an interest of "+intr+" for your current balance for "+t+" Months.");
    }
}

class BankAccount{
    public static void main(String[] args){
        Account obj=new Account();
        obj.interest();
    }
}
