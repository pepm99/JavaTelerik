import java.util.Scanner;

public class isItPrimeNummber {
	public static void main(String[] args){
		System.out.print("Enter a positive integer number: ");
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		int divider = 2;
		int maxDivider = (int) Math.sqrt(number);
		boolean prime = true;
		while (prime && (divider <= maxDivider)) {
		    if (number % divider == 0) {
		        prime = false;
		    }
		    divider++;
		}
		System.out.println(number + " is " + (prime?"":" not") + " prime");
		scanner.close();
	}
}
