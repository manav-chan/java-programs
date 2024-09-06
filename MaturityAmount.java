/*
Q4. Using the switch statement, write a menu-driven program to calculate the maturity amount of a bank account. The user is given following options:
i)  Term Deposit
ii) Recurring Deposit
For option 1: Accept Principal(P), rate of interest(r), and time in years(n). Calculate and print maturity amount(A) receivable using formula: A = P(1+r/100)^n
For option 2: Accept monthly installment(P), rate of interest(r) and time period in months(n). Calculate the maturity amount(A) receivable using formula: A = Pn + Pn(n+1)/2 * r/100 * 1/12
For incorrect option, display appropriate message.
 */
import java.util.Scanner;
public class MaturityAmount 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for Term Deposit, Press 2 for Recurring Deposit: ");
        byte ch = sc.nextByte();

        System.out.print("Enter Principal or monthly installment: ");
        int pr = sc.nextInt();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years for Term Deposit or time in months for Recurring Deposit: ");
        byte n = sc.nextByte();
        sc.close();

        double amt = 0.0;
        switch (ch) {
            case 1:
                amt = pr * Math.pow(1 + rate / 100, n);
                break;
            case 2:
                amt = pr * n + pr * n * (n + 1) / 2.0 * rate / 100.0 * 1 / 12.0;
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.printf("Maturity Amount: %.2f", amt);
    }
}
/*
PS E:\College\Java Lab> java MaturityAmount
Press 1 for Term Deposit, Press 2 for Recurring Deposit: 1
Enter Principal or monthly installment: 1000
Enter rate of interest: 5
Maturity Amount: 1276.28

PS E:\College\Java Lab> java MaturityAmount
Press 1 for Term Deposit, Press 2 for Recurring Deposit: 2
Enter Principal or monthly installment: 1000
Enter rate of interest: 5
Enter time in years for Term Deposit or time in months for Recurring Deposit: 5
Maturity Amount: 5062.50
 */