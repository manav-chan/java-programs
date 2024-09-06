/*
Q17. Create a class "MyCalculator" which consists of a single method power(int, int). This method takes two integers, n and p as parameters and finds n^p. If either n or p is negative, then the method must throw an exception which says "n and p should be non negative."
 */

import java.util.Scanner;
class MyException extends Exception
{
    int detail;
    MyException(int a) {
        detail = a;
    }
    public String toString() {
        return "java.lang.Exception: n and p should be non negative";
    }
}
public class Calculator
{
    int power(int n, int p) throws MyException
    {
        if(n < 0 || p < 0)
        throw new MyException(p);

        return (int)Math.pow(n, p);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();
        boolean err = false;
        int n, p, ans=0;
        do {
            try {
                System.out.print("Enter n and p: ");
                n = sc.nextInt();
                p = sc.nextInt();
                err = false;
                ans = obj.power(n, p);
            }
            catch(MyException e) {
                System.out.println(e);
                err = true;
            }
            catch(Exception e) {
                System.out.println(e);
            }
        } while(err == true);
        System.out.println("Answer: " + ans);
        sc.close();
    }
}
/*
OUTPUT:
Enter n and p: -1 -2
java.lang.Exception: n and p should be non negative
Enter n and p: -1 2
java.lang.Exception: n and p should be non negative
Enter n and p: 5 3
Answer: 125
 */