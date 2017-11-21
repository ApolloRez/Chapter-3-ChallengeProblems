import java.util.Scanner;
public class Number7SortedNames 
{
	public static void main(String[]args)
	{
		String name1 = "Kyle";
		String name2 = "Lary";
		String name3 = "Placo";
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter three names.");
		name1 = userInput.nextLine();
		name2 = userInput.nextLine();
		name3 = userInput.nextLine();
		System.out.println("The names in alphabetical order are:");
		if(name1.compareToIgnoreCase(name2) < 0 && name1.compareToIgnoreCase(name3) < 0)
		{
			System.out.println(name1);
			if(name2.compareTo(name3) < 0) 
			{
				System.out.println(name2);
				System.out.println(name3);
			}else
			{
				System.out.println(name3);
				System.out.println(name2);
			}
		}else if(name2.compareToIgnoreCase(name1) < 0 && name2.compareToIgnoreCase(name3) < 0) {
				System.out.println(name2);
			if(name1.compareTo(name3) < 0)
			{
				System.out.println(name1);
				System.out.println(name3);
			}else
			{
				System.out.println(name3);
				System.out.println(name1);
			}		
		}else if(name3.compareToIgnoreCase(name2) < 0 && name3.compareToIgnoreCase(name1) < 0) {
				System.out.println(name3);
			if(name2.compareTo(name1) < 0)
			{
				System.out.println(name2);
				System.out.println(name1);
			}else
			{
				System.out.println(name1);
				System.out.println(name2);
			}
		}
	}
}
