import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	System.out.println("First name:");
		String fname = sc.nextLine();
	System.out.println("Last name:");
			String lname = sc.nextLine();
		System.out.println(Name(fname,lname));
	}
	public static String Name (String fname,String lname){
	    return "My name is:"+ fname+" "+lname;
}
}