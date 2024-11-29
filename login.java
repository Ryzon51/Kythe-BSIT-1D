import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUsername = "Kythe";
        String correctPassword = "1234";
        
        Scanner scnr = new Scanner(System.in);
        boolean loggedIn = false;
        int attempts = 0;
        
        while (!loggedIn && attempts < 3) {
            System.out.print("Enter username: ");
            String username = scnr.nextLine();
            System.out.print("Enter password: ");
            String password  = scnr.nextLine();            
            if (correctUsername.equals(username) && correctPassword.equals(password)) {
                System.out.println("Login Successful");
                loggedIn = true;
                displayCalculator(scnr);
            } else {
                System.out.println("Invalid username or password. Try again.");
                attempts++;
            }
        }       
        if (!loggedIn) {
            System.out.println("All attempts failed. EXITING PROGRAM");
        }        
        scnr.close();
    }
    
    public static void displayCalculator(Scanner scnr) {
        while (true) {
            System.out.println("Calculator");
            System.out.println("A. Addition");
            System.out.println("B. Subtraction");
            System.out.println("C. Multiplication");
            System.out.println("D. Division");
            System.out.println("E. Exit");
            System.out.print("Please choose an option: ");          
            String choice = scnr.nextLine().toUpperCase();            
            if (choice.equals("E")) {
                System.out.println("THANK YOU FOR USING THE PROGRAM");
                break;
            }            
            System.out.print("Enter the FIRST number: ");
            if (!scnr.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scnr.next();
                continue;
            }
            double num1 = scnr.nextDouble();
            
            System.out.print("Enter the SECOND number: ");
            if (!scnr.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scnr.next(); 
                continue;
            }
            double num2 = scnr.nextDouble();
            scnr.nextLine(); 
            
            switch (choice) {
                case "A":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "B":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "C":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "D":
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("ERROR: Division by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please choose between A-E.");
            }
        }
    }
}