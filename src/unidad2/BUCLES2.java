package unidad2;

import java.util.Scanner;

public class BUCLES2 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int a = 1;
		int i = 0;
		int a2 = a;
		int i2 = i;
int e =0;
int e2=e;
		System.out.println("for  ");
		for (e = e; e< 5; ++e) {

			a = extracted(tc);
			i = i + a;
		}

		extracted(i, e);

		System.out.println(" ");
		System.out.println("while ");

		a = a2;
		i = i2;
		e=e2;
		while (e != 5) {
            e++;
			a = extracted(tc);
			i = i + a;

		}
		extracted(i, e);
		System.out.println(" ");

		System.out.println("do-while");

		a = a2;
		i = i2;
		e=e2;
		do {
             e++;
			a = extracted(tc);
			i = i + a;

		} while (e != 5);

		extracted(i, e);

	}

	private static void extracted(int i, int e) {
		System.out.println("la media es   " + i/e);
	}


	private static int extracted(Scanner tc) {
		int a;
		System.out.println("inserte numeros ");

		a = tc.nextInt();
		tc.nextLine();
		return a;
	}

}
