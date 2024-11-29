import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 0;

        while (attempt < 5) {
            System.out.println("Enter Your Username:");
            String username = sc.nextLine();
            System.out.println("Enter Your Password:");
            String password = sc.nextLine();

            String status = loginValidator(username, password);

            if (status.equals("success")) {
                System.out.println("Login Successfully");
                sc.close();
                break;
            } else {
                attempt++;
                System.out.println("Incorrect! Attempts remaining: " + (5 - attempt));
            }
        }

        if (attempt == 5) {
            System.out.println("Maximum attempts reached.");
        }
    }

    private static String loginValidator(String username, String password) {
        String defaultUsername = "Kythe";
        String defaultPassword = "12345";

        if (username.equals(defaultUsername) && password.equals(defaultPassword)) {
            return "success";
        } else {
            return "fail";
        }
    }
}