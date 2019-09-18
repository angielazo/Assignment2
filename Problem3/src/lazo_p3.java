
import java.util.Scanner;

public class lazo_p3 {

	public static void main(String[] args) {
		
		String[] topics = {"Environment", "LGBTQ Rights", "Social Media", "Health Bills", "Sport Events"};
		int [][] responses = new int [5][10];
		int numresp;
		int i;
		int j;
		int pollresponse;
		int counter;
		int[] total = new int[5];
		int minTopic = 0;
		int maxTopic = 0;
		int averageRating;
		
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter the number of polls that will be taken.");
		numresp = scnr.nextInt();
		
		System.out.println("For each topic, rate how important it is to you. 1 being the least, 10 being the most important.");
		
		int min = total[0];
		int max = total[0];
		
		for (i = 0; i < numresp; i = i+1) {
			
			
			for (j = 0; j < 5; j = j+1) {
				
				System.out.println("\n" +topics[j]);
				
				pollresponse = scnr.nextInt();
				
				++responses[j][pollresponse - 1];
				
				total[j] = total[j] + pollresponse;
				
					
				if(total[j] > max) {
						
						max = total[j];
						
						maxTopic = j;
						
					}
					
				if(total[j] < min) {
					
					min = total[j];
					
					minTopic = j;
				}
				
			}
			
			
		}
		
		System.out.print("\nRate:        \t\t");
		for (i = 0; i < 10; i = i +1) {
			
			System.out.print((i+1) + " ");
		}
		
		System.out.println(" ");
		
		for (i = 0; i < 5; i = i +1) {
			System.out.print("\n" + topics[i] + "        \t");
		
			for (j = 0; j < 10; j = j + 1) {
				
				System.out.print(responses[i][j] + " ");
				
			}
			
			averageRating = total[i] / numresp;
			
			System.out.println("\tAverage Rate: " + averageRating);
			
			
			System.out.println("");
			
			
		}
		
		
		
		System.out.println("\nIssue with Most Points: " + topics[maxTopic] + ". Point total: " + total[maxTopic] + ".");
		System.out.println("\nIssue with Least Points: " + topics[minTopic] + ". Point total: " + total[minTopic] + ".");

	}

}
