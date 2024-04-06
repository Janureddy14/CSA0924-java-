import java.util.*;
class Circle{
    int radius;
    void area(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Radius:");
        radius=s.nextInt();
    }
    void result(){
        double result=3.14*radius*radius;
        System.out.println("The area of Circle is "+result);
    }
}

class Circ{
    public static void main(String[] args){
        Circle obj=new Circle();
        obj.area();
        obj.result();
    }
}
