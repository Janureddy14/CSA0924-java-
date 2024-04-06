import java.util.*;
class Sum{
    protected int n, i, sum=0;
    void get(){
        System.out.print("Enter the no of terms: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
    }
    void sumof(){
        for(i=0;i<=n;i++){
            sum=sum+i;
        }
    }
}
class Fact extends Sum{
    private int fact=1;
    void fact(){
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
    }
    void display(){
        System.out.println("Sum of "+n+" Numbers is : "+sum);
        System.out.println("Factorial of "+n+" Numbers is : "+fact);
    }
}
class Factsum{
    public static void main(String[] args){
        Fact obj=new Fact();
        obj.get();
        obj.sumof();
        obj.fact();
        obj.display();
    }
}
