// Q7. WAP to print a given array in zig-zag fashion.
import java.util.Scanner;
public class Zigzag
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++)
        arr[i] = sc.nextInt();

        sc.close();
        for(int i=1; i<n; i += 2)
        {
            if(arr[i] < arr[i-1])
            {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            if(i+1 < n && arr[i] < arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.print("Zigzag: ");
        for(int i=0; i<n; i++)
        System.out.print(arr[i] + " ");
    }
}
/*
Enter size: 7
Enter array elements: 4 3 7 8 6 2 1
Zigzag: 3 7 4 8 2 6 1 
 */