/*
Q1. WAP to print the first 10 Fibonacci numbers.
*/
public class Fibonacci
{
    public static void main(String args[])
    {
        int n = 10;
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Numbers: 0 1 ");
        for(int i=2; i<n; i++)
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

// Fibonacci Numbers: 0 1 1 2 3 5 8 13 21 34