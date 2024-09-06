// Q6. WAP to replace all 0's with 1 in a given integer number.
import java.util.Scanner;
public class Replace01 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();

        String num = Integer.toString(n);
        String modified_num = "";
        for(int i=0; i<num.length(); i++)
        {
            char ch = num.charAt(i);
            if(ch == '0')
            modified_num += '1';
            else
            modified_num += ch;
        }
        System.out.println("Modified Number: " + modified_num);
    }
}
/*
Enter number: 203058
Modified Number: 213158
 */