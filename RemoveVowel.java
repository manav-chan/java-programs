// Q10. WAP to remove vowels in a given string using String Buffer class.
import java.util.Scanner;
public class RemoveVowel 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        sc.close();

        StringBuffer sb = new StringBuffer(s);
        for(int i=0; i<sb.length(); i++)
        {
            char ch = sb.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            sb.delete(i, i+1);
        }
        System.out.println("Vowels Removed: " + sb);
    }
}
/*
Enter string: hello world
Vowels Removed: hll wrld
 */