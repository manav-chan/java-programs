/*
Q18. Write a java file handling program to count and display the number of palindrome word present in a text file "myfile.txt".
 */
import java.io.*;
import java.util.Scanner;
public class Pallindrome {
    public static int countPallin(String line) {
        Scanner sc = new Scanner(line);
        String word;
        int count = 0;
        while(sc.hasNext()) {
            word = sc.next();
            String reverseWord = "";
            for(int i=word.length() - 1; i>=0; i--)
            reverseWord += word.charAt(i);

            if(word.equals(reverseWord))
            count ++;
        }
        sc.close();
        return count;
    }
    public static void main(String args[]) {
        FileReader fr = null;
        BufferedReader br = null;
        int count = 0;
        try {
            fr = new FileReader("myfile.txt");
            br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null) {
                count += countPallin(line);
            }  
        }
        catch(IOException e) {
            System.out.println(e);
        }
        finally {
            try {
                if(fr != null)
                fr.close();
                if(br != null)
                br.close();
            }
            catch(IOException e) {
                System.out.println("Can't close files " + e);
            }
        }
        System.out.println("Total Pallindrome words: " + count);
    }
}
