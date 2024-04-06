import java.util.*;
class StepsforZero_18{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int num, step=0;
System.out.println("Enter the number: ");
num=s.nextInt();
while(num>0){
if(num%2==0){
num=num/2;
}
else{
num=num-1;
}
step++;
}
System.out.println("Steps taken are: "+step);
}
}
