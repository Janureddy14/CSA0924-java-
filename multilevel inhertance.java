import java.util.*;
class Circle1{
    protected double area;
    private int r;
    void get(int a){
        r=a;
    }
    void cal(){
        area=3.14*r*r;
    }
}
class Cylinder1 extends Circle1{
    protected double volume;
    private int h;
    void get1(int b){
        h=b;
    }
    void cal1(){
        volume=area*h;
    }
}
class Cone extends Cylinder1{
    protected double Cvolume;
    void cal2(){
        Cvolume=0.33*volume;
    }
    void display(){
        System.out.println("The Area of Circle is :"+area);
        System.out.println("The Volume of Cylinder is: "+volume);
        System.out.println("The Volume of Cone is :"+Cvolume);
    }
}
class Inheri{
    public static void main(String[] args){
        int x,y;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Radius:");
        x=s.nextInt();
        System.out.print("Enter Height:");
        y=s.nextInt();
        Cone obj=new Cone();
        obj.get(x);
        obj.cal();
        obj.get1(y);
        obj.cal1();
        obj.cal2();
        obj.display();
    }
}
