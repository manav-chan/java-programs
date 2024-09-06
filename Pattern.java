// Q11. WAP to find all the patterns of 0(1+)0 in the given string of binary number.
import java.util.Scanner;
public class Pattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.next();
        sc.close();

        int i = 0, count = 0;
        boolean flag = false;
        System.out.println("Strings with pattern:");
        for(int j=0; j<s.length(); j++)
        {
            char ch = s.charAt(j);
            if(ch == '0')
            {
                if(flag == false)
                {
                    flag = true;
                }
                else
                {
                    if(j - i != 1)
                    {
                        count ++;
                        for(int k=i; k<=j; k++)
                        System.out.print(s.charAt(k));
                        System.out.println();
                    }
                }
                i = j;
            }
        }
        System.out.println("Count: " + count);
    }
}
/*
Enter binary string: 1011100110110
Strings with pattern:
01110
0110
0110
Count: 3
 */