import java.util.*;
class SumSeries{
    int n;
    void Sum(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of elements in the series: ");
        n = s.nextInt();
    }
    void result(){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The Sum of "+n+" terms is : "+sum);
    }
}

class Sum{
    public static void main(String[] args){10
        SumSeries obj=new SumSeries();
        obj.Sum();
        obj.result();
    }
}
