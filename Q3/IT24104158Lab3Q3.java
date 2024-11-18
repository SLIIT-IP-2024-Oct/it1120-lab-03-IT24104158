import java.util.Scanner;

public class IT24104158Lab3Q3{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a rupee amount: ");
		double rupeeAmount=scanner.nextDouble();
		
		int notes5000=(int)(rupeeAmount/5000);
		rupeeAmount%=5000;

		int notes1000=(int)(rupeeAmount/1000);
		rupeeAmount%=1000;

		int notes500=(int)(rupeeAmount/500);
		rupeeAmount%=500;

		int notes200=(int)(rupeeAmount/200);
		rupeeAmount%=200;

		int notes100=(int)(rupeeAmount/100);
		rupeeAmount%=100;

		int notes50=(int)(rupeeAmount/50);
		rupeeAmount%=50;

		int notes20=(int)(rupeeAmount/20);
		rupeeAmount%=20;

		int coins10=(int)(rupeeAmount/10);
		rupeeAmount%=10;

		int coins5=(int)(rupeeAmount/5);
		rupeeAmount%=5;

		int coins2=(int)(rupeeAmount/2);
		rupeeAmount%=2;

		int coins1=(int)(rupeeAmount/1);

		System.out.println("5000 notes: "+notes5000 );
		System.out.println("1000 notes: "+notes1000 );
		System.out.println("500 notes: "+notes500 );
		System.out.println("200 notes: "+notes200 );
		System.out.println("100 notes: "+notes100 );
		System.out.println("50 notes: "+notes50 );
		System.out.println("20 coins: "+notes20 );
		System.out.println("10 coins: "+coins10 );
		System.out.println("05 coins: "+coins5);
		System.out.println("02 coins: "+coins2 );
		System.out.println("01 coins: "+coins1);
		
		scanner.close();
		}
}