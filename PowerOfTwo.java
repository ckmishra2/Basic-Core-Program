package basic;

import java.util.Scanner;

public class PowerOfTwo{


	void multiply(int n){
		int num = 1;
		for(int i=0; i<n; i++) {
			num = num*2;
			System.out.println(num);
		}
	}
		public static void main(String[] args){
			PowerOfTwo P2 = new PowerOfTwo();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int n = sc.nextInt();
			P2.multiply(n);
		}
	}







