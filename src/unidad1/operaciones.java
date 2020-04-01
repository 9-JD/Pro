package unidad1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class operaciones {

	public static void main(String[] args) throws IOException {

		Scanner tec = new Scanner(System.in);
		int i = 1;

		while (i != 0) {

			++i;
			System.out.println("introduca numeros");
			try {
				System.out.println("num1");
				double num1 = tec.nextDouble();
				tec.nextLine();
				System.out.println("num2");
				double num2 = tec.nextDouble();
				tec.nextLine();

				System.out.println("elija la operaacion +, -, *, / (para salir del programa pulse cero");
				char leer = (char) System.in.read();

				switch (leer) {
				case '+':

					System.out.println(num1 + num2);

					break;

				case '-':

					System.out.println(num1 - num2);

					break;

				case '*':

					System.out.println(num1 * num2);

					break;

				case '/':
					if (num2 == 0.0) {

						throw new ArithmeticException();
					} else {
						System.out.println(num1 / num2);
					}

					break;
				case '0':

					System.out.println("programa finalizado");
					i = 0;
					break;
				}

			} catch (InputMismatchException e) {

				System.err.println("introduca numeros " + e.getMessage());
				tec.nextLine();

			} catch (ArithmeticException ae) {
				System.out.println("\n* No es posible dividir por cero, vuelva a intentarlo *");

			}

		}

	}
}