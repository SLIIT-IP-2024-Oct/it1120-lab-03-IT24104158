import java.util.Scanner;

public class IT24104158Lab3Q4{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a five-digit number: ");
		int num=scanner.nextInt();
		int firstDigit = num/ 10000;
            	int secondDigit = (num / 1000) % 10;
            	int thirdDigit = (num / 100) % 10;
            	int fourthDigit = (num / 10) % 10;
           	int fifthDigit = num % 10;
		

		System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit);
		
		scanner.close();
		}
}