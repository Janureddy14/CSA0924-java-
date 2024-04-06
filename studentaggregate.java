import java.util.*;
class StudentAggregate_08{
public static void main(String[] args){
double marks, agg, sum=0; 
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of subjects: ");
n=s.nextInt();
System.out.println("Enter "+n+" Subjects Marks ");
for(int i=1; i<=n; i++){
System.out.println("Enter "+i+" Subject Marks: ");
marks=s.nextInt();
sum=sum+marks;
}
System.out.println("TOTAL of marks in "+n+" subjects is: "+sum);
agg=(sum/n);
System.out.println("AGGREGATE of marks in "+n+" subjects is: "+agg);
if(agg>=75 && agg<=100){
System.out.println("DISTINCTION");
}
else if(agg>=60 && agg<75){
System.out.println("FIRST DIVISION");
}
else if(agg>=50 && agg<60){
System.out.println("SECOND DIVISION");
}
else if(agg>=40 && agg<50){
System.out.println("THIRD DIVISION");
}
else if(agg>=0 && agg<40)
{
System.out.println("FAILED");
}
else{
System.out.println("Aggreagate is not valid");
}
}
}
