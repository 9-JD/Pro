package unidad2;

import java.io.IOException;
import java.util.Scanner;

public class energia {

	public static void main(String[] args) throws IOException {
	Scanner tec =new Scanner (System.in);

	
		int numero_de_visitas = 0;
		char A = ' ';
		int a = 0;

		int b = 0;

		int c = 0;

		int n = 0;
		char codigo = '#';

		while (codigo != '?') {

			System.out.println("inserte clase A , B , C , N");
			A = (char) System.in.read();
			tec.nextLine();

			switch (A) {

			case 'A':

				++numero_de_visitas;
				++a;
				break;
			case 'B':

				++numero_de_visitas;
				++b;
				break;

			case 'C':

				++numero_de_visitas;
				++c;
				break;
			case 'N':

				++numero_de_visitas;
				++n;
				break;
			default:
				System.out.println("introduca lo antes nombrado");

			}
			
			System.out.println("introduZCA ? PARA SALIR");
			codigo= (char) System.in.read();
			tec.nextLine();

		}
		
		System.out.println("numero de visitas" +numero_de_visitas);	
		
		System.out.println("numero de visitas a" +a+ "porcetaje "+((double)a/numero_de_visitas)*100);
		
		System.out.println("numero de visitas b" +b+ "porcetaje "+(b/(double)numero_de_visitas)*100);
		System.out.println("numero de visitas a" +c+ "porcetaje "+((double)c/numero_de_visitas)*100);
		System.out.println("numero de visitas a" +n+ "porcetaje "+((double)n/numero_de_visitas)*100);
		
		

	}

}
