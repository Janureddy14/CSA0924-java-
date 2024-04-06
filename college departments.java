import java.util.*;
class MyProgram{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String dept;
        System.out.print("Enter the Department name:");
        dept=s.nextLine();
        if(dept.equals("CSE")||dept.equals("ECE")||dept.equals("MECH")||dept.equals("CIVIL")||dept.equals("ENEE"))
        {
            System.out.print("Belongs to SSE college\n");
        }
        else if(dept.equals("CARDIO")||dept.equals("NEURO"))
        {
            System.out.print("Belongs to SMC college\n");
        }
        else if(dept.equals("BCOM")||dept.equals("BSC"))
        {
            System.out.print("Belongs to SCLAS college\n");
        }
        else if(dept.equals("FASHION")||dept.equals("ARCHITECTURE"))
        {
            System.out.print("Belongs to SCAD college\n");
        }
    }
}
