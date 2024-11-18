import java.util.Scanner;

public class IT24104158Lab3Q2{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the monthly salary: ");
		double monthlySalary=scanner.nextDouble();

		System.out.print("Enter the number of OT hours: " );
		int num_OThrs=scanner.nextInt();

		System.out.print("Enter the OT hourly rate: " );
		double OThourlyrate=scanner.nextDouble();

      		double OTAmount=(num_OThrs*OThourlyrate);
		double totalSalary=monthlySalary+OTAmount;

		System.out.println("The total salary including OT is: "+totalSalary);
		
		scanner.close();
		}
}