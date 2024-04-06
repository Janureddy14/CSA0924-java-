import java.util.*;
class Star{
    char ch;
    int i, cl=0, cu=0, cn=0;
    void get(){
        do{
            System.out.print("Enter any character: ");
            Scanner s=new Scanner(System.in);
            ch=s.next().charAt(0);
            if(ch=='*'){
                System.out.print("'*'-Encountered Exiting Program!!\n");
                break;
            }
            else if(Character.isLowerCase(ch)){
                cl++;
            }
            else if(Character.isUpperCase(ch)){
                cu++;
            }
            else if(Character.isDigit(ch)){
                cn++;
            }
            else{
                System.out.print("Enter a valid Character!!\n");
            }
        }while(true);
    }
    void display(){
        System.out.println("Total count of lower case: "+cl);
        System.out.println("Total count of upper case: "+cu);
        System.out.println("Total count of numbers: "+cn);
    }
}
class Star1{
    public static void main(String[] args){
        Star obj=new Star();
        obj.get();
        obj.display();
    }
}
