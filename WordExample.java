/* Q1. Define a class "WordExample" having the following description:
Data members: private String strdata - to store a sentence
Parameterized Constructor:
WordExample(String) - Accept a sentence which may be terminated by either '.', '?', '!' only. The words may be separated by more than one blank space and are in upper case.
Member Methods -
void countWord() - Find the no. of words beginning and ending with a vowel
void placeWord() - Place the words beginning and ending with a vowel at the beginning followed by the remaining words as they are in sentence. */
public class WordExample 
{
    private String strdata;
    WordExample(String s)
    {
        strdata = s;
    }

    private void countWord()
    {
        Scanner s = new Scanner(strdata);
        int count = 0;
        while(s.hasNext())
        {
            String word = s.next();
            char beg = word.charAt(0), end = word.charAt(word.length() - 1);
            if((beg == 'A' || beg == 'E' || beg == 'I' || beg == 'O' || beg == 'U') && (end == 'A' || end == 'E' || end == 'I' || end == 'O' || end == 'U'))
            {
                count ++;
            }
        }
        System.out.println("Count of words beginning and ending with vowels: " + count);
    }
}
