import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        String password = new StringBuilder(username).reverse().toString();
        
        int attempts = 0;
        
        
        while (attempts < 4) {
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();
            
            if (inputPassword.equals(password)) {
                System.out.println("User " + username + " logged in.");
                break;
            } else {
                attempts++; 
                
                if (attempts < 4) {
                    System.out.println("Incorrect password. Try again.");
                } else {
                    System.out.println("User " + username + " blocked!");
                }
            }
        }
        
        scanner.close();
    }
}