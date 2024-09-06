// Q8. WAP to rearrange positive and negative integers in an array.
import java.util.Scanner;
public class PosNeg
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

        int pos = -1, neg = 0, temp;
        while(neg < n)
        {
            if(arr[neg] < 0)
            {
                pos++;
                temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
            }
            neg++;
        }
        System.out.print("Rearranged Array: ");
        for(int i=0; i<n; i++)
        System.out.print(arr[i] + " ");
    }
}
/*
Enter size: 6
Enter array elements: 5 2 -1 4 -3 -6
Rearranged Array: -1 -3 -6 4 2 5 
 */