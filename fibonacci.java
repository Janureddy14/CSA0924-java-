import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1=0,n2=1,sum=0,i;
		System.out.println("enter the n value: ");
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			sum=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=sum;
		}
	}
}
