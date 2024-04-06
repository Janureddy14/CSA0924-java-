import java.util.*;
class Name{
    String S1, S2, S3, S4, S5;
    int cl=0, cu=0, l;
    void get(){
        System.out.print("Enter Your Name: ");
        Scanner s=new Scanner(System.in);
        S1=s.nextLine();
        if(!S1.contains("e")){
            System.out.print("Your name does not contain Letter E\n");
        }
        else{
            S2=S1.replace("e", "*");
        }
        S3=String.valueOf(S1.charAt(5));
        l = S1.length();
        S4=S1.toLowerCase();
        S5=S1.toUpperCase();
    }
    void answer(){
        for(char c: S1.toCharArray()){
            if(Character.isLowerCase(c)){
                cl++;
            }
            else if(Character.isUpperCase(c)){
                cu++;
            }
        }
    }
    void result(){
        System.out.println("1: Length of "+S1+" is : "+l);
        System.out.println("2: No of Uppercase in "+S1+" is: "+cu);
        System.out.println("2-i:"+S1+" after converting into Lower case is :"+S4);
        System.out.println("3: No of Lowercase in "+S1+" is: "+cl);
        System.out.println("3-i:"+S1+" after converting into upper case is :"+S5);
        System.out.println("4:"+S2);
        System.out.println("5:'"+S3+"'is the charater Present at 5th location");
    }
    public static void main(String[] args){
        Name obj=new Name();
        obj.get();
        obj.answer();
        obj.result();
    }
}
