import java.util.*;
class Username{
    protected String U1, U2;
    Username(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String A:");
        U1=s.nextLine();
        System.out.println("Enter String 2:");
        U2=s.nextLine();
    }
    void Comparision(){
        if(U1.equals(U2)){
            System.out.println("Username is Valid\n");
        }
        else{
            System.out.println("Username is Invalid\n");
        }
    }
    public static void main(String[] args){
        Username obj=new Username();
        obj.Comparision();
    }
}
