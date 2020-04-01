package unidad2;

import java.util.Scanner;

public class BUCLES3 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int a = 1;
		int i = 0;
		int a2 = a;
		int i2 = i;

		System.out.println("for  ");
		for (a = a; a != 0;) {

			a = extracted(tc);
			i = i + a;
		}

		extracted(i);

		System.out.println(" ");
		System.out.println("while ");

		a = a2;
		i = i2;
		while (a != 0) {

			a = extracted(tc);
			i = i + a;

		}
		extracted(i);
		System.out.println(" ");

		System.out.println("do-while");

		a = a2;
		i = i2;

		do {

			a = extracted(tc);
			i = i + a;

		} while (a != 0);

		extracted(i);

	}

	private static void extracted(int i) {
		System.out.println("la suma es  " + i);
	}

	private static int extracted(Scanner tc) {
		int a;
		System.out.println("inserte datos ");

		a = tc.nextInt();
		tc.nextLine();
		return a;
	}

}
