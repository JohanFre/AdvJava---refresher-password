package pass;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pass = ("asdasd");
		Scanner input = new Scanner(System.in);
		int attempts = 3;
		Boolean passInput = true;
		
		System.out.println("Enter your password: ");
		
		while (passInput && attempts-- > 0) {
			String passAttempt = input.nextLine();
			
			if (passAttempt.equals(pass)) {
				System.out.println("You're logged in!");
			}
			else if (!passAttempt.equals(pass)) {
				System.out.println("Wrong password! Attempts remaining: " + attempts);
			}
			else {
				break;
			}
		}
		
		input.close();
	}

}
