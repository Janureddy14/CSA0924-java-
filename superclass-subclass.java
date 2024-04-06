import java.util.*;
class Superclass{
    protected int number1;
    Superclass(int number1){
        this.number1=number1;
    }
    void display(){
        System.out.println("The Numbers are:\n"+number1);
    }
}
class Subclass extends Superclass{
    private int number1, number2;
    Subclass(int number1, int number2){
        super(number1);
        this.number2=number2;
    }
    void display(){
        super.display();
        System.out.println(number2);
    }
}
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Numbers:\n");
        /*int number1=s.nextInt();
        int number2=s.nextInt();
        if((!(isDigit(number1)))||(!(isDigit(number2)))){
            System.out.print("Enter a Numerical Input!!");
        }*/
        int number1, number2;
        try {
            number1 = s.nextInt();
            number2 = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a Numerical Input!!");
            return;
        }
        Subclass obj=new Subclass(number1, number2);
        obj.display();
    }
}
