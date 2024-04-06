import java.util.*;
class FactusingOOP{
    int n, fact=1, i, res;
    void fact(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number to find Factorial:");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        res=fact;
    }
    void result(){
        System.out.println("The factorial of Given Number "+n+" is "+res);
    }
}
class FACT{
    public static void main(String[] args){
        FactusingOOP obj=new FactusingOOP();
        obj.fact();
        obj.result();
    }
}
