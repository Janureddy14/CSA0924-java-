import java.util.*;
class BOX{
    double width, height, depth;
    BOX(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Height:");
        double height=s.nextDouble();
        System.out.print("Enter the Width:");
        double width=s.nextDouble();
        System.out.print("Enter the Depth:");
        double depth=s.nextDouble();
        BOX b3=new BOX(width, height, depth);
        double res=b3.volume();
        System.out.println("The volume is "+res);
    }
}
