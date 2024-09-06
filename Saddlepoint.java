// Q9. WAP to find and print saddle point co-ordinates in a given matrix.
import java.util.Scanner;
public class Saddlepoint 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Enter matrix elements");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++)
            arr[i][j] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<m; i++) 
        {
            int min = arr[i][0], minidx = 0;
            for(int j=0; j<n; j++) 
            {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                    minidx = j;
                }
            }
            int max = arr[i][minidx];
            boolean flag = false;
            for(int k=0; k<m; k++)
            {
                if(arr[k][minidx] > max) {
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                System.out.printf("Saddlepoint at: (%d,%d) - %d", i+1, minidx+1, arr[i][minidx]);
                break;
            }
        }
    }    
}
/*
Enter size of matrix: 3 3
Enter matrix elements
1 2 3
4 5 6
7 8 9
Saddlepoint at: (3,1) - 7
 */