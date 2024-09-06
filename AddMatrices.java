// Q2. WAP to print the addition of two 3x3 matrices.
import java.util.Scanner;
public class AddMatrices 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        
        System.out.println("Enter elements of the 1st matrix");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++)
                a[i][j] = sc.nextInt();
        }

        System.out.println("Enter elements of the 2nd matrix");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++)
                b[i][j] = sc.nextInt();
        }

        System.out.println("Sum:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] += b[i][j];
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
Enter elements of the 1st matrix
1 2 3
4 5 6
7 8 9
Enter elements of the 2nd matrix
1 2 3
4 5 6
7 8 9
Sum:
2       4       6
8       10      12
14      16      18
 */