package basic;


	import java.util.Scanner;
	public class VowelConsonent {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter An Alphabet ");
			char letter=sc.next().charAt(0);
			if(letter=='a' || letter=='e' ||letter=='i' ||letter=='o' ||letter=='u' ) {
				System.out.println("This is a Vowel");
			}
			else
				System.out.println("This is a Consonent");
		}


}
