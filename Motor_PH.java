import java.util.Scanner;
public class Motor_PH       {
    public static void main(String args[])      {
        // For Input
        Scanner input = new Scanner(System.in);
    	// Inputs for Employee Details
        System.out.print("Employee Number: ");
        int empn = input.nextInt();
        System.out.print("Last name: ");
        String last = input.next();
        System.out.print("First name: ");
        String first = input.next();
        System.out.print("Enter Birth Month: ");
        String month = input.next();
        System.out.print("Enter Birth Date: ");
        String date = input.next();
        System.out.print("Enter Birth Year: ");
        String year = input.next();
        // Inputs for Calculation
        System.out.print("Enter Working Hours Last Monday (Input Zero if absent): ");
        double mon = input.nextDouble();
        System.out.print("Enter Working Hours Last Tuesday (Input Zero if absent): ");
        double tue = input.nextDouble();
        System.out.print("Enter Working Hours Last Wednesday (Input Zero if absent): ");
        double wed = input.nextDouble();
        System.out.print("Enter Working Hours Last Thursday (Input Zero if absent): ");
        double thu = input.nextDouble();
        System.out.print("Enter Working Hours Last Friday (Input Zero if absent): ");
        double fri = input.nextDouble();

        // Calculation
        double thours = mon + tue + wed + thu + fri;


        //Out puts
        System.out.println("Employee Number: " + empn);
        System.out.println("Name: " + last + " " + first);
        System.out.println("Birthdate: " + month + " " + date + " " + year);
        System.out.println("Your total working hours this week: " + thours + " hrs");

        // closing the scanner object
        input.close();
        
    }
}