import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter the First Grade:");
 	double  first = scnr.nextDouble();
 	System.out.print("Enter the Second Grade:"); 
 	double  second = scnr.nextDouble();
		System.out.print("Enter the Third Grade:"); 
 	double  third = scnr.nextDouble();
 	String result = Grade(first,second,third);
 	System.out.println("You  " + result);
	}
	public static String Grade(double first, double second, double third) {
	    double result = (first + second + third) / 3;
	    return result >= 85 ? "Passed" : "Failed";
	}
}