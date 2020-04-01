package unidad2;

import java.util.Scanner;

public class BUCLES6 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int a = 1;
		int i = 0;
		int a2 = a;
		int i2 = i;
		int e = 0;
		int e2 = e;

		System.out.println("for  ");
		for (e = e; e < 7; ++e) {

			a = extracted(tc);
			i = extracted1(a, i);

		}
		extracted(i);

		System.out.println(" ");
		System.out.println("while ");

		a = a2;
		i = i2;
		e = e2;

		while (e != 10) {
			e++;
			a = extracted(tc);
			i = extracted1(a, i);

		}
		extracted(i);

		System.out.println(" ");

		System.out.println("do-while");

		a = a2;
		i = i2;
		e = e2;

		do {
			e++;
			a = extracted(tc);
			i = extracted1(a, i);

		} while (e != 10);

		extracted(i);
	}



	private static void extracted(int i) {
		System.out.println(i);
	}

	

	private static int extracted1(int a, int i) {
		if (a>i) {i=a;}
		return i;
	}




	private static int extracted(Scanner tc) {
		int a;
		System.out.println("inserte numeros ");

		a = tc.nextInt();
		tc.nextLine();
		return a;
	}

}
