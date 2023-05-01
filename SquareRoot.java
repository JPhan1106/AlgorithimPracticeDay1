package big0Homework;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println ("Please input a number: ");
		Scanner sc = new Scanner (System.in);
		double inputValue = sc.nextDouble();
		
		System.out.println("Square root of " + inputValue + " is " + findSquareRoot(inputValue));
		
		System.out.println("Big0 is: 0(logn)");
	}

	public static double findSquareRoot(double inputValue) {
		double num;
		double half = inputValue/2;
		
		if (inputValue < 0) {
			return -1;

		} else if (inputValue == 0) {
			return 0;

		} else {
			do {
				num = half;
				half = (num + (inputValue/num)) /2;
			} while ((num-half) != 0);
			return half;
		}
	}
	
//	public static double findSquareRoot(double inputValue) {
//		if (inputValue < 0) {
//			return -1;
//
//		} else if (inputValue == 0) {
//			return 0;
//
//		} else {
//			for (double i = 0; i <= inputValue/2 ; i+=0.0000000001) { Big0: 0(n);
//				if (i*i == inputValue) {
//					return i;
//				}
//			}
//	}
//}
}
