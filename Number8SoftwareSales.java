import java.util.Scanner;

public class Number8SoftwareSales 
{
	public static void main (String [] args)
	{
		Scanner user = new Scanner(System.in);
		int numberOfPackages;
		double discount;
		System.out.println("How many pachages would you like to purchase?");
		numberOfPackages = user.nextInt();
		
		if(numberOfPackages < 10) 
		{
			System.out.println("Quantity to low. 10 or more required.");
			numberOfPackages = user.nextInt();
		}
		if(numberOfPackages > 9 && numberOfPackages < 20)
		{
			discount = numberOfPackages * .8;
			System.out.printf("Price after discount is $%.2f.",discount);
		}
		if(numberOfPackages > 19 && numberOfPackages < 50)
		{
			discount = numberOfPackages * .7;
			System.out.printf("Price after discount is $%.2f.",discount);
		}
		if(numberOfPackages > 49 && numberOfPackages < 100)
		{
			discount = numberOfPackages * .6;
			System.out.printf("Price after discount is $%.2f.",discount);
		}
		if(numberOfPackages > 99)
		{
			discount = numberOfPackages * .5;
			System.out.printf("Price after discount is $%.2f.",discount);
		}
		user.close();
		System.exit(0);
	}
}
