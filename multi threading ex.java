import java.util.*;
class Athread extends Thread{
    int i, n1, pro1;
    public void run(){
        try{
            Scanner s=new Scanner(System.in);
            System.out.print("Enter number 1 : ");
            n1=s.nextInt();
            for(i=1;i<=10;i++){
                pro1=n1*i;
                System.out.println(n1+"x"+i+"="+pro1);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.print("Exceeded n value!!");
        }
        System.out.println("Exiting "+n1+" multipliaction !!");
    }
}
class Bthread extends Thread{
    int i, n2, pro2;
    public void run(){
        try{
            Scanner s=new Scanner(System.in);
            System.out.print("\nEnter number 2 : ");
            n2=s.nextInt();
            for(i=1;i<=10;i++){
                pro2=n2*i;
                System.out.println(n2+"x"+i+"="+pro2);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.print("Exceeded n value!!");
        }
        System.out.print("Exiting "+n2+" multipliaction !!");
    }
}
class Multithreadtest{
    public static void main(String[] args)
    {
        Athread a=new Athread();
        Bthread b=new Bthread();
        a.start();
        b.start();
    }
}
