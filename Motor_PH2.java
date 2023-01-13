import java.util.Scanner;
public class Motor_PH2       {
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
        
        
        // Inputs for Calculation of Working Hours

        //monday
        System.out.println("Enter Time in 24 hrs format");
        System.out.println("Hour first then press enter for min");
        System.out.print("Enter Time in last Monday: ");
        int monh = input.nextInt();
        System.out.print(monh + ":");
        int monm = input.nextInt();
        System.out.print("Enter Time out last Monday: ");
        int monho = input.nextInt();
        System.out.print(monho + ":");
        int monmo = input.nextInt();
        //tuesday
        System.out.print("Enter Time in last Tuesday: ");
        int tueh = input.nextInt();
        System.out.print(tueh + ":");
        int tuem = input.nextInt();
        System.out.print("Enter Time out last Tuesday: ");
        int tueho = input.nextInt();
        System.out.print(tueho + ":");
        int tuemo = input.nextInt();
        //wednesday
        System.out.print("Enter Time in last Wednesday: ");
        int wedh = input.nextInt();
        System.out.print(wedh + ":");
        int wedm = input.nextInt();
        System.out.print("Enter Time out last Wednesday: ");
        int wedho = input.nextInt();
        System.out.print(wedho + ":");
        int wedmo = input.nextInt();
        //Thursday
        System.out.print("Enter Time in last Thursday: ");
        int thuh = input.nextInt();
        System.out.print(monh + ":");
        int thum = input.nextInt();
        System.out.print("Enter Time out last Thursday: ");
        int thuho = input.nextInt();
        System.out.print(thuho + ":");
        int thumo = input.nextInt();
        //Friday
        System.out.print("Enter Time in last Friday: ");
        int frih = input.nextInt();
        System.out.print(frih + ":");
        int frim = input.nextInt();
        System.out.print("Enter Time out last Friday: ");
        int friho = input.nextInt();
        System.out.print(friho + ":");
        int frimo = input.nextInt();
        
        // Inputs for Calculation of Gross
        System.out.print("Enter your Hourly Rate: ");
        double rate = input.nextInt();


        // Calculation of Working Hours
        //monday
        double monI = (monh * 60) + monm ;
        double monO = (monho * 60) + monmo ;
        double mon = (monO - monI) / 60 ;
        //tuesday
        double tueI = (tueh * 60) + tuem ;
        double tueO = (tueho * 60) + tuemo ;
        double tue = (tueO - tueI) / 60 ;
        //wednesday
        double wedI = (wedh * 60) + wedm ;
        double wedO = (wedho * 60) + wedmo ;
        double wed = (wedO - wedI) / 60 ;
        //thursday
        double thuI = (thuh * 60) + thum ;
        double thuO = (thuho * 60) + thumo ;
        double thu = (thuO - thuI) / 60 ;
        //friday
        double friI = (frih * 60) + frim ;
        double friO = (friho * 60) + frimo ;
        double fri = (friO - friI) / 60 ;

        double total = mon + tue + wed + thu + fri ;

        // Calculation of gross
        double gross = total * rate ;


        //Out puts
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Good day " + first + "!");
        System.out.println("Employee Number: " + empn);
        System.out.println("Name: " + last + " " + first);
        System.out.println("Birthdate: " + month + " " + date + " " + year);
        System.out.println("Your total working hours this week is: " + total +" hrs");
        System.out.println("Your gross weekly salary is: " +" Php "+ gross );
        

        // closing the scanner object
        input.close();
        
    }
}