import java.util.*;
class SI{
    int p, t, r;
    void simpleinterest(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Principal Amount:");
        p=s.nextInt();
        System.out.print("Enter the Rate of Interest:");
        r=s.nextInt();
        System.out.print("Enter the Time Period:");
        t=s.nextInt();
    }
    void result(){
        int si=(p*t*r)/100;
        System.out.println("The Simple Interest is:"+si);
    }
}

class Simple_Interest{
    public static void main(String[] args){
        SI obj=new SI();
        obj.simpleinterest();
        obj.result();
    }
}
