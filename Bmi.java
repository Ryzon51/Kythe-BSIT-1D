import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
 	System.out.print("Enter Weight (kg):");
 	double weight = scnr.nextDouble();
 	System.out.print("Enter Height (m):"); 
 	double  height = scnr.nextDouble();
 	if (height > 0){
 	    double bmi = weight / (height *height); 
 	   System.out.println("Your Bmi is:"+bmi);
 	    	} else {
 	     System.out.println ("Height must be grester than zero.");
 	}
 	scnr.close();
	}
}