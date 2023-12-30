import java.util.*;
class Reversing_number
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1,rem,rev=0,n;
		System.out.println("enter the number: ");
		n=s.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reversed number is : "+rev);
	}
}
