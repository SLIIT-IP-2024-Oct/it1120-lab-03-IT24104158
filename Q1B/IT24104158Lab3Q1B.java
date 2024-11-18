import java.util.Scanner;

public class IT24104158Lab3Q1B{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Price for 1kg: ");
		double priceFor_1kg=scanner.nextDouble();

		System.out.print("Number of kg: " );
		double numberOfkilos=scanner.nextDouble();
                double discount=0.10;
		double totalAmount = (priceFor_1kg * numberOfkilos);
		double discountAmount= (priceFor_1kg * numberOfkilos)*discount;
		double finalAmount= totalAmount-discountAmount;
		

		System.out.println("Price for 1kg: "+priceFor_1kg);
		System.out.println("Number of kg: "+numberOfkilos);
		System.out.println("payableAmount: "+totalAmount);
		System.out.println("finalAmount: "+finalAmount);

		scanner.close();
		}
}