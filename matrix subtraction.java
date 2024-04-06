import java.util.*;
class MatrixSubtractition{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int r,c;
        int i,j;
        System.out.print("Enter no of rows:");
        r=s.nextInt();
        System.out.print("Enter no of columns:");
        c=s.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int sum[][]=new int[r][c];
        System.out.print("Enter elements of Matrix-A:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.print("Enter elements of Matrix-B:");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                b[i][j]=s.nextInt();
            }
        }
        System.out.print("The resultant matrix of A-B is:\n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                sum[i][j]=a[i][j]-b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
