import java.util.*;
class MethodOverloading{
    void arg(){
        System.out.print("Welcome to java!\n");
    }
    void arg(String a){
        for(int i=1;i<=2;i++){
            System.out.println(a);
        }
    }
    void arg(String b,int c)
    {
        for(int i=1;i<=3;i++){
            System.out.println(b);
        }
    }
    public static void main(String[] args){
        MethodOverloading t=new MethodOverloading();
        t.arg();
        t.arg("Welcome to Programming!");
        t.arg("Welcome to Overloading!", 4);
    }
}

