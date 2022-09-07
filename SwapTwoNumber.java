package basic;

import java.util.Scanner;

public class SwapTwoNumber {
	int x;
	int y;
	
	void swap(SwapTwoNumber sw) {
		int temp = sw.x;
		sw.x = sw.y;
		sw.y= temp;
	}
	
	public static void main(String[] args) {
		SwapTwoNumber sw = new SwapTwoNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		sw.x = sc.nextInt();
		System.out.println("Enter 2nd Number");
		sw.y =sc.nextInt();
		System.out.println("before swap");
		System.out.println("value of x: "+sw.x+" value of y: "+sw.y);
		sw.swap(sw);

		System.out.println("after swap");
		System.out.println("value of x: "+ sw.x +" value of y: "+sw.y);
	}
}
