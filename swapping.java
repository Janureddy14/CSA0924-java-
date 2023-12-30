import java.util.*;
class Swapping
{
	public static void main(String args[])
	{
	int a,b,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number: ");
	a=s.nextInt();
	System.out.println("enter the number: ");
	b=s.nextInt();
	temp=a;
	a=b;
	b=temp;
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	}
}
