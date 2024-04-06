import java.util.*;
class Str{
    String S1="I Love java";
    String S2="java";
    String S3="JAVA";
    String S4, S5, S6, S7, S8;
    int S9, S10, S14; 
    char S13;
    boolean S11, S12;
    void stri(){
        S4=S1.toLowerCase();
        S5=S1.toUpperCase();
        S6=S1.replace('o','i');
        S7=S1.substring(2);
        S8=S1.substring(2, 6);
        S9=S1.indexOf('L');
        S10=S1.length();
        S11=S2.equals(S3);
        S12=S2.equalsIgnoreCase(S3);
        S13=S1.charAt(2);
        S14=S2.compareTo(S3);
    }
    void display(){
        System.out.println("1: "+S4);
        System.out.println("2: "+S5);
        System.out.println("3: "+S6);
        System.out.println("4: "+S7);
        System.out.println("5: "+S8);
        //System.out.println("6: "+S1.indexOf('L')); We can directly print using this.
        System.out.println("6: "+S9);
        System.out.println("7: "+S10);
        System.out.println("8-i: "+S11);
        System.out.println("8-ii: "+S12);
        System.out.println("9: " +S13);
        System.out.println("10: "+S14);
    }
}
class StringEx{
    public static void main(String[] args){
        Str obj=new Str();
        obj.stri();
        obj.display();
    }
}
