import java.util.*;
class Leap
{
	public static void main(String args[])
	{
	int d,m,year;
	Scanner s=new Scanner(System.in);	
	System.out.println("enter the date: ");
	d=s.nextInt();
	System.out.println("enter the month: ");
	m=s.nextInt();
	System.out.println("enter the year: ");
	year=s.nextInt();
	if(d>31 || m>12)
	{
		System.out.println("enter valid input");
	}
	else
	{
		if(year % 4 == 0 && year % 100!= 0 || year % 400 == 0)
		{
		System.out.println("leap year");
		}
		else
		{
		System.out.println("not a leap year");
		}
	}
	}
}
