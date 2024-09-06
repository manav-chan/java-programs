/*
Q16. Write a Java program to accept and print the employee details during runtime. The details will include employee id, name, and department id. The program should raise an exception if user inputs incomplete or incorrect data. The entered values should meet the following conditions.
i) First letter of employee name should be in captial letter.
ii) Employee id should be between 2001 and 5001
iii) Deparment id should be an integer between 1 and 5.
 */
import java.util.Scanner;
class MyException extends Exception
{
    int detail;
    MyException(int a) {
        detail = a;
    }
    public String toString() {
        if(detail == 1) 
            return "Exception: First Letter should be capital";
        else if(detail == 2) 
            return "Exception: Employee id should be between 2001 and 5001";
        else
            return "Exception: Department id should be between 1 and 5";
    }
}

public class Employee 
{
    int id, depId;
    String name;
    Employee(int id, int depId, String name) {
        this.id = id;
        this.depId = depId;
        this.name = name;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department ID: " + depId);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean err = false;
        int id = 0, depId = 0;
        String name = "";

        do {
            try {
                System.out.print("Enter ID: ");
                id = sc.nextInt();
                if(id < 2001 || id > 5001)
                throw new MyException(2);
                err = false;
                
                System.out.print("Enter Name: ");
                sc.nextLine();
                name = sc.nextLine();
                char ch = name.charAt(0);
                if(Character.isLowerCase(ch) == true)
                throw new MyException(1);
                err = false;
    
                System.out.print("Enter Department id: ");
                depId = sc.nextInt();
                if(depId < 1 || depId > 5)
                throw new MyException(3);
                err = false;
            }
            catch (MyException e) {
                System.out.println(e);
                err = true;
            }
            catch(Exception e) {
                System.out.println(e);
            }
        } while(err == true);
        Employee obj = new Employee(id, depId, name);
        obj.display();
        sc.close();
    }
}

/*
OUTPUT:
Enter ID: 1
Exception: Employee id should be between 2001 and 5001
Enter ID: 2003
Enter Name: Cillian Murphy
Enter Department id: 2
ID: 2003
Name: Cillian Murphy
Department ID: 2
 */