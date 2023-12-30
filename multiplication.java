import java.util.*;
class Multiplication
{
	public static void main(String args[])
	{
		int m,n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter m:");
		m=s.nextInt();
		System.out.println("enter n");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			
			System.out.println(i+"*"+m+"="+i*m);
		}
		
	}
}
