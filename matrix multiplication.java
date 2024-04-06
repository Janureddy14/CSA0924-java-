import java.util.*;
class MatrixMultiplication{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int ar, br, ac, bc;
        int i,j,k;
        System.out.print("Enter no of rows for Matrix-A:");
        ar=s.nextInt();
        System.out.print("Enter no of columns for Matrix-A:");
        ac=s.nextInt();
        System.out.print("Enter no of rows for Matrix-B:");
        br=s.nextInt();
        System.out.print("Enter no of columns for Matrix-B:");
        bc=s.nextInt();
        if(ac!=br){
            System.out.print("Matrix Multiplication not possible!!");
            return;
        }
        int a[][]=new int[ar][ac];
        int b[][]=new int[br][bc];
        int res[][]=new int[ar][bc];
        System.out.print("Enter elements of Matrix-A:");
        for(i=0;i<ar;i++){
            for(j=0;j<ac;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.print("Enter elements of Matrix-B:");
        for(i=0;i<br;i++){
            for(j=0;j<bc;j++){
                b[i][j]=s.nextInt();
            }
        }
        System.out.print("The resultant matrix of A*B is:\n");
        for(i=0;i<ar;i++){
            for(j=0;j<bc;j++) {
                res[i][j] = 0;
                for (k = 0; k < ac; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(i=0;i<ar;i++){
            for (j = 0; j < bc; j++) {
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
