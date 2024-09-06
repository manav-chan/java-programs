/*
Q12. Write a java program to create a class named 'Bank' with the following data members:
1. Name of depositor
2. Address of depositor
3. Account number
4. Balance in Account
Class Bank has following methods:
1. Generate unique account no. for each depositor (1001, 1002, ...) and add information for each depositor.
2. Display information and balance of depositor.
3. Deposit an amount in balance of any depositor.
4. Withdraw an amount from balance of any depositor.
5. Change the address of depositor.
Perform following operations:
1. Enter information of the depositors.
2. Print information of any depositor.
3. Add amount to account of any depositor and display updated information.
4. Remove some amount from an account of any depositor and display information.
5. Update address of any depositor and display updated information.
 */
import java.util.Scanner;
public class Bank
{
    String name, address;
    int accno;
    double balance;

    static int number = 0;
    public void addInfo(String n, String addr)
    {
        number ++;
        name = n;
        address = addr;
        balance = 0.0;
        accno = 1000 + number;
        System.out.println("Information Added!");
    }
    public void display()
    {
        System.out.println("Information of the user");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + accno);
        System.out.println("Balance: " + balance);
    }
    public void deposit(double amt)
    {
        balance += amt;
        System.out.println("Balance: " + balance);
    }
    public void withdraw(double with)
    {
        balance -= with;
        System.out.println("Balance: " + balance);
    }
    public void changeAddr(String addr)
    {
        address = addr;
        System.out.println("Updated Address: " + address);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of depositors: ");
        int n = sc.nextInt();
        sc.nextLine();

        Bank[] objs = new Bank[n];
        for(int i=0; i<n; i++)
        {
            objs[i] = new Bank();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter address: ");
            String adr = sc.nextLine();

            objs[i].addInfo(name, adr);
        }
        System.out.print("Enter depositor number for displaying: ");
        int dep_num = sc.nextInt();
        objs[dep_num - 1].display();

        System.out.print("Enter depositor number for depositing: ");
        dep_num = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        objs[dep_num - 1].deposit(amt);
        objs[dep_num - 1].display();

        System.out.print("Enter depositor number for withdrawing: ");
        dep_num = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        amt = sc.nextDouble();
        objs[dep_num - 1].withdraw(amt);
        objs[dep_num - 1].display();

        System.out.print("Enter depositor number for changing address: ");
        dep_num = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new address: ");
        String adr = sc.nextLine();
        objs[dep_num - 1].changeAddr(adr);
        objs[dep_num - 1].display();

        sc.close();
    }
}
/*
Enter number of depositors: 3
Enter name: Manav Chauhan  
Enter address: Neshvilla Road
Information Added!
Enter name: Lisa        
Enter address: Korea
Information Added!
Enter name: Emma Watson 
Enter address: London
Information Added!
Enter depositor number for displaying: 1
Information of the user
Name: Manav Chauhan
Address: Neshvilla Road
Account Number: 1001
Balance: 0.0
Enter depositor number for depositing: 1
Enter amount to deposit: 2500
Balance: 2500.0
Information of the user
Name: Manav Chauhan
Address: Neshvilla Road
Account Number: 1001
Balance: 2500.0
Enter depositor number for withdrawing: 1
Enter amount to withdraw: 500
Balance: 2000.0
Information of the user
Name: Manav Chauhan
Address: Neshvilla Road
Account Number: 1001
Balance: 2000.0
Enter depositor number for changing address: 1
Enter new address: MDDA
Updated Address: MDDA
Information of the user
Name: Manav Chauhan
Address: MDDA
Account Number: 1001
Balance: 2000.0
 */