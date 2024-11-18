import java.util.Scanner;

public class IT24104158Lab3Q1A{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Price for 1kg: ");
		double priceFor_1kg=scanner.nextDouble();

		System.out.print("Number of kg: " );
		double numberOfkilos=scanner.nextDouble();

		double totalAmount = priceFor_1kg * numberOfkilos;
		

		System.out.println("Price for 1kg: "+priceFor_1kg);
		System.out.println("Number of kg: "+numberOfkilos);
		System.out.println("payableAmount: "+totalAmount);

		scanner.close();
		}
}