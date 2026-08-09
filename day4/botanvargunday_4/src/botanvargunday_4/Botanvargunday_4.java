package botanvargunday_4;

import java.util.Scanner;

public class Botanvargunday_4 {

	public static void main(String[] args) {
		int randomNumber = (int)(Math.random()* 100) + 1;
		Scanner s1 = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Enter the number between 1-100");
		while (true) {
			int selectedNumber = s1.nextInt();
			
			if (selectedNumber < 1 || selectedNumber > 100) {
				System.out.println("You are selected wrong range. Try again.");
				continue;
			}
			
			count++;
			
			if (randomNumber > selectedNumber) {
				System.out.println("Your selected number is lower than random number. Try again.");
			}
			
			else if (randomNumber < selectedNumber) {
				System.out.println("Your selected number is greater than random number.Try again.");
			}
			
			else {
				System.out.println("Congrulations. You are selected correct number.");
				System.out.println("You are selected correct number by time : " + count);
				break;
			}
		
		
		}
	}
}
