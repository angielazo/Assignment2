
import java.util.Scanner;

public class lazo_p2 {

	public static void main(String[] args) {
		
		// Declaring variables
		String userInput;
		double userBMI1;
		double userBMI2;
		double userWeight;
		double userHeight;
		
		// Setting up scanner 
		Scanner scnr = new Scanner(System.in);
		
		// Getting the user information for type, weight, and height
		System.out.println("Would you like to calculate your BMI using metric or imperial values?\nPlease type: M or I\n\nPlease use uppercase only.");
		userInput = scnr.next();
		
		System.out.println("\nPlease enter your weight in the units you specified (pounds or kilograms).");
		userWeight = scnr.nextDouble();
		
		System.out.println("Please enter your height in the units you specified (inches or meters).");
		userHeight = scnr.nextDouble();

		// IF statements for either imperial or metric data
		if (userInput.equals("I")) {
			
		userBMI1 = (userWeight * 703) / (userHeight * userHeight);
		System.out.printf("\nYour BMI is: %f.", userBMI1);
		System.out.println("\n\nHere is the BMI scale set by the National Heart Lung and Blood Institute:\n\nUnderweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater");
		
		}
		
		if (userInput.equals("M")) {
			
			userBMI2 = (userWeight) / (userHeight * userHeight);
			
			System.out.printf("\nYour BMI is: %.2f.", userBMI2);
			System.out.println("\n\nHere is the BMI scale set by the National Heart Lung and Blood Institute:\n\nUnderweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater");
			
			}
	}

}
