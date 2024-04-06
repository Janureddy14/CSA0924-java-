import java.util.*;
class Marks{
    private int S1, S2, S3, S4;
    protected int total=0;
    void getmarks(int A, int B, int C, int D){
        S1=A;
        S2=B;
        S3=C;
        S4=D;
    }
    void caltotal(){
        int sum=S1+S2+S3+S4;
        total = total+sum;
    }
}
class Aggregate extends Marks{
    protected double aggregate;
    void calaggregate(){
        aggregate=(total/4);
    }
}
class Grade extends Aggregate{
    void calgrade(){
        if(aggregate>75){
            System.out.print("You Scored DISTINCTION.\n");
            System.out.print("CONGRATULATIONS!!");
        }
        else if(aggregate>=60 && aggregate<75){
            System.out.print("You scored FIRST DIVISION.");
        }
        else if(aggregate>=50 && aggregate<60){
            System.out.print("You scored SECOND DIVISION.");
        }
        else if(aggregate>=40 && aggregate<50){
            System.out.print("You scored THIRD DIVISION.");
        }
        else if(aggregate>=0 && aggregate<40){
            System.out.print("You have FAILED in Exams.");
            System.out.print("Improve your Grades!!");
        }
        else{
            System.out.print("Aggregate is not defined!!");
        }
    }
    void display(){
        System.out.println("\nTotal Marks are : "+total);
        System.out.println("Your aggregate is : "+aggregate);
    }
}
class StudentMarks{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int W, X, Y, Z;
        System.out.print("Enter the marks in Python: ");
        W=s.nextInt();
        System.out.print("Enter the marks in C-Programming: ");
        X=s.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        Y=s.nextInt();
        System.out.print("Enter the marks in Physics: ");
        Z=s.nextInt();
        if(W<0||W>100||X<0||X>100||Y<0||Y>100||Z<0||Z>100){
            do{
            System.out.print("Enter a valid mark(i.e between 0 and 100)!!\n");
            System.out.print("Re-Enter Again Marks Properly.\n");
            System.out.print("Enter the marks in Python: ");
            W=s.nextInt();
            System.out.print("Enter the marks in C-Programming: ");
            X=s.nextInt();
            System.out.print("Enter the marks in Mathematics: ");
            Y=s.nextInt();
            System.out.print("Enter the marks in Physics: ");
            Z=s.nextInt();
            }while(W<0||W>100||X<0||X>100||Y<0||Y>100||Z<0||Z>100);
        }
        Grade obj=new Grade();
        obj.getmarks(W, X, Y, Z);
        obj.caltotal();
        obj.calaggregate();
        obj.calgrade();
        obj.display();
    }
}
