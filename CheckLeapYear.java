package basic;
import java.util.Scanner;
public class CheckLeapYear {
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System. in);
		System. out. print("Enter any year:");
		int year = Sc. nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("this year is a leap year"+year);
		}
		else
			System.out.println("this year is not a leap year");
	}

}
