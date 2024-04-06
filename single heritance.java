import java.util.*;
class Circle{
    protected double area;
    private int r;
    void get(int a){
        r=a;
    }
    void cal(){
        area=3.14*r*r;
    }
}
class Cylinder extends Circle{
    protected double volume;
    private int h;
    void get1(int b){
        h=b;
    }
    void cal1(){
        volume=area*h;
    }
    void display(){
        System.out.println("The area of Circle is :"+area);
        System.out.println("The volume of Cylinder is: "+volume);
    }
}
class Inher{
    public static void main(String[] args){
        int x,y;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Radius:");
        x=s.nextInt();
        System.out.print("Enter Height:");
        y=s.nextInt();
        Cylinder obj=new Cylinder();
        obj.get(x);
        obj.cal();
        obj.get1(y);
        obj.cal1();
        obj.display();
    }
}
