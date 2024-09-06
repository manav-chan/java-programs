import java.util.Scanner;
public class Frequency
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int wordCount = 0; // count the total number of words
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            wordCount ++;
        }
        wordCount ++;
        String words[] = new String[wordCount]; // array to store all the unique words
        int freq[] = new int[wordCount]; // frequency array to store count of all unique words

        Scanner tok = new Scanner(s);
        int count = 0; // to store count of unique words
        while(tok.hasNext())
        {
            boolean flag = false;
            String temp = tok.next(); // word goes into temp
            for(int i=0; i<count; i++) // checks if word is present in words[] array, if present increment it's frequency else add word to words[] array.
            {
                if(temp.equals(words[i]))
                {
                    flag = true;
                    freq[i] ++;
                }
            }
            if(flag == false)
            {
                words[count] = temp;
                freq[count]++;
                count ++;
            }
        }
        for(int i=0; i<count; i++)
        {
            System.out.println(words[i] + " " + freq[i]);
        }
        sc.close();
        tok.close();
    }
}