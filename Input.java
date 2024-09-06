/* 
Q3. Write a Java program to use 
i)  command line argument to take input 
ii) class and member function to take input
Your name, course, university roll no, and semester. Display the information as:
Name
University Roll no
Course
Semester
 */
import java.util.Scanner;
public class Input 
{
    String name, course;
    int uni_roll, sem;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter university roll no: ");
        uni_roll = sc.nextInt();
        sc.nextLine(); // so \n does not go to String course
        System.out.print("Enter course: ");
        course = sc.nextLine();
        System.out.print("Enter semester: ");
        sem = sc.nextInt();
        sc.close();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Uni Roll no: " + uni_roll);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + sem);
    }
    public static void main(String args[])
    {
        if(args.length != 0)
        {
            System.out.println("Name: " + args[0]);
            System.out.println("Uni Roll no: " + args[1]);
            System.out.println("Course: " + args[2]);
            System.out.println("Semester: " + args[3]);
        }
        else
        {
            Input obj = new Input();
            obj.input();
            obj.display();
        }
    }    
}
/*
PS E:\College\Java Lab> java Input Manav 2018919 BTech 4
Name: Manav
Uni Roll no: 2018919
Course: BTech
Semester: 4

PS E:\College\Java Lab> java Input
Enter name: Manav Chauhan
Enter university roll no: 2018919
Enter course: BTech
Enter semester: 4
Name: Manav Chauhan
Uni Roll no: 2018919
Course: BTech
Semester: 4
 */