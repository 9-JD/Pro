package unidad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class introducion {

	public static void main(String[] args) {

		double nota1 = 0;
		double notaf = 0;
		Scanner tec = new Scanner(System.in);
		int i;

		for (i = 0; i < 3; ++i) {

			try {

				System.out.println("introduzca la " + (i + 1) + " nota ");
				nota1 = tec.nextDouble();
				tec.nextLine();
				if (nota1 >= 1) {

					notaf = notaf + nota1;
				}

				else {
					System.out.println("numeros mayores a uno ");

					i = i - 1;
				}

			}

			catch (InputMismatchException e) {

				System.out.println("introduzca numeros por favor  " + e.getMessage());
				tec.nextLine();
				i = i - 1;

			}
		}

		notaf = notaf / i;
		System.out.println("su nota es  " + notaf);

		tec.close();
	}

}
