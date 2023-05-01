package big0Homework;

import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {

		System.out.println("Please enter a Roman numeral: ");
		Scanner sc = new Scanner(System.in);
		String inputRomanNumeral = sc.next();
		System.out.println("Integer number is: " + getIntegerFromRomanNumeral(inputRomanNumeral));
		System.out.println("\n");
		System.out.println("Big 0: 0(n)");

	}

	public static int getIntegerFromRomanNumeral(String romanNumeral) {
		int result = 0;
		for (int i = 0; i < romanNumeral.length(); i++) {
			switch (romanNumeral.charAt(i)) {
			case 'I':
				result = result + 1;
				break;
			case 'V':
				result = result + 5;
				break;
			case 'X':
				result = result + 10;
				break;
			case 'L':
				result = result + 50;
				break;
			case 'C':
				result = result + 100;
				break;
			case 'D':
				result = result + 500;
				break;
			case 'M':
				result = result + 1000;
				break;
			}
		}

		if (romanNumeral.contains("IV") || romanNumeral.contains("IX")) {
			result = result - 2;
		}
		if (romanNumeral.contains("XL") || romanNumeral.contains("XC")) {
			result = result - 20;
		}
		if (romanNumeral.contains("CD") || romanNumeral.contains("CM")) {
			result = result - 200;
		}

		return result;
	}
}
