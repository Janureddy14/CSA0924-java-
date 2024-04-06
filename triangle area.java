import java.util.*;
class Triangle{
    int height, breadth;
    void area(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Height:");
        height=s.nextInt();
        System.out.print("Enter the Breadth:");
        breadth=s.nextInt();
    }
    void result(){
        double result=0.5*height*breadth;
        System.out.println("The area of Triangle is "+result);
    }
}

class Tri{
    public static void main(String[] args){
        Triangle obj=new Triangle();
        obj.area();
        obj.result();
    }
}
