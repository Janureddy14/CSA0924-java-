import java.util.*;
class Rectangle{
    int height, width;
    void area(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Height:");
        height=s.nextInt();
        System.out.print("Enter the width:");
        width=s.nextInt();
    }
    void result(){
        int result=height*width;
        System.out.println("The area of Rectangle is "+result);
    }
}

class Rect{
    public static void main(String[] args){
        Rectangle obj=new Rectangle();
        obj.area();
        obj.result();
    }
}
