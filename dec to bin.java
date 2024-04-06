import java.util.*;
class DectoBintoBinRevtoDec{
public static void main(String[] args){
String bin, rbin;
int n1, n2;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
n1=s.nextInt();
bin=Integer.toBinaryString(n1);
System.out.println("Binary value is:"+bin);
StringBuilder Rbin=new StringBuilder(bin);
Rbin.reverse();
rbin=Rbin.toString();
System.out.println("Reversed Binary is: "+rbin);
n2=Integer.parseInt(rbin, 2);
System.out.println("Final Binary: "+n2);
}
}
