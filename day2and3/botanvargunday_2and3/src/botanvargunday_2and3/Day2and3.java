package botanvargunday_2and3;

public class Day2and3 {

	public static void main(String[] args) {
		/*
		int sum = 0;
		int evenCount = 0;
		int oddCount = 0;
		int i;

		System.out.println("The numbers of 1 to 100");
		
		
		for (i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\nEven numbers:");
		
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				evenCount++;
			}
		}
		
		System.out.println("\n\nOdd numbers:");
		
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				oddCount++;
			}
		}
		
		for (i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("\n\nSum of numbers: " + sum);
		System.out.println("Even Count: " + evenCount);
		System.out.println("Odd Count: " + oddCount);
		*/
	
		int sum = 0;
		int i = 1;
		
		System.out.println("The numbers of 1 to 10: ");
		
		while (i <= 10) {
			System.out.print(i + " ");
			sum = sum + i;
			i++;
		}

		System.out.println("\n\nThe sum of the numbers: " + sum);
	
	}
	
}
