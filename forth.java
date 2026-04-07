package fiftyprog.java;
import java.util.Scanner;
public class forth 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name + ", age " + age + ", GPA " + gpa);

        scanner.close();
    }
}