package unidad2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class edad_acceso {

	public static void main(String[] args) throws IOException {
		Scanner tec = new Scanner(System.in);
		int i = 0;

		do {

			try {
				System.out.println("inserte edad");
				int edad = tec.nextInt();
				tec.nextLine();
				System.out.println(
						"inserte tipo de acceso “A” acceso directo, “G” grado medio, “P” prueba\r\n" + "de acceso");
				char acceso = (char) System.in.read();
				tec.nextLine();

				if (acceso == 'A' || acceso == 'G' || acceso == 'P') {

					++i;

					if (edad < 18 && acceso == 'A') {

						System.out.println("“Pase por secretaría");

					}

					else if (edad >= 18 && (acceso == 'G' || acceso == 'P')) {

						System.out.println("“Solicite código en jefatura”.");

					}

					else {
						System.out.println(" “Las clases son en la R03, gracias”");
					}
				}

				else {
					System.err.println("inserte tipo de acceso “A” acceso directo, “G” grado medio, “P” prueba");
				}

			} catch (InputMismatchException e) {
				System.err.println("“introduzca numeros ”.");
				tec.nextLine();

				--i;
			}

		} while (i < 1);
	}

}
