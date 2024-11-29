import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			
		int [ ] numbers = {1,2,3,4,5};
		System.out.print ("Original list of Numbers");
		for (int num: numbers) {
		    System.out.println(num+",");		
	}
	System.out.println("Updated list of Numbers"); 
	for (int i = 0; i < numbers.length; i++) {
	numbers[i] = sc.nextInt();
	System.out.println(numbers[i]);
    	}
	}
}