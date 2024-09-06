// Q5. WAP to check whether a given pair of numbers are a friendly pair or not.
import java.util.Scanner;
public class FriendlyPair
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pair of numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int sum1 = 0;
        for(int i=1; i <= a/2; i++)
        {
            if(a % i == 0)
            sum1 += i;
        }
        int sum2 = 0;
        for(int i=1; i <= b/2; i++)
        {
            if(b % i == 0)
            sum2 += i;
        }
        
        if(sum1 == a && sum2 == b)
        System.out.println("Friendly Pair");
        else
        System.out.println("Not a Friendly Pair");
    }
}
/*
PS E:\College\Java Lab> java FriendlyPair
Enter pair of numbers:
28 6
Friendly Pair

PS E:\College\Java Lab> java FriendlyPair
Enter pair of numbers: 
5 10
Not a Friendly Pair
 */