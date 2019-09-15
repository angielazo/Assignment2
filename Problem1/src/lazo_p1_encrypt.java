import java.util.Scanner;

public class lazo_p1_encrypt {

	public static void main(String[] args) {
		
		// Declaring variables	
		int enterCode;
		int firstDigit;
		int secureFirst;
		int secondDigit;
		int secureSecond;
		int thirdDigit;
		int secureThird;
		int fourthDigit;
		int secureFourth;
		String newCode;
		
		
		// Setting up scanner in
		Scanner scnr = new Scanner(System.in);
		
		
		// User enters in code and gets saved to variable
		System.out.print("Enter 4 digit passcode: ");
		enterCode = scnr.nextInt();
		//scnr.close();
		
	// Securing first digit
		// Isolating first digit 
		firstDigit = enterCode / 1000;
		
		// Recalculating first digit to secure digit
		secureFirst = (firstDigit + 7) % 10;

	// Securing second digit
		// Isolating second digit
		secondDigit = (enterCode / 100) % 10;
		
		// Recalculating second digit to secure digit
		secureSecond = (secondDigit + 7) % 10;

	// Securing third digit
		// Isolating third digit
		thirdDigit = (enterCode / 10) % 10;
		
		
		// Recalculating third digit to secure digit
		secureThird = (thirdDigit + 7) % 10;
		
	// Securing fourth digit 
		// Isolating fourth digit
		fourthDigit = (enterCode % 10);
		
		// Recalculating fourth digit to secure digit
		secureFourth = (fourthDigit + 7) % 10;
		
		// Printing encrypted code
		newCode = ("" + secureThird + secureFourth + secureFirst + secureSecond);
		System.out.print("Encrypted code: " + newCode);

	}

}
