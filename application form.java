import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("APPLICATION FORM"); 
		
		System.out.print("Enter Your Name: ");
		String Name = scnr.nextLine();
		System.out.print("Gender: ");
		String Gender = scnr.nextLine();
		System.out.print("Enter Your Age: ");
		int Age = scnr.nextInt();
		System.out.print("Weight: ");
		double Weight = scnr.nextDouble();
		System.out.print("Height: ");
		int Height = scnr.nextInt();
		
		System.out.println("/n Result");
		System.out.println("Name: " + Name);
		System.out.println("Gender: " + Gender);
		System.out.println("Age: " + Age); 
		System.out.println("Weight: " + Weight + "kg");
		System.out.println("Height: " + Height + "cm");
	}
}