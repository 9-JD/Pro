

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class examen2eva {

	public static void main(String[] args) {
		// creamos la variable

		// declaramos las variables
		Scanner tec = new Scanner(System.in);
		String comandos = "cmd:time#notepad:miejercicio.text#ping:localhost#cmd:date";

		// separamos el "#" ta tendiramos solo que quitar :
		String[] comandos_resultados = comandos.split("#");

		String comando2 = "";
		// ahora vamos a comcatenar cada elemento del vector para poder separarlos y que
		// queden todos se parados
		for (int i = 0; i < comandos_resultados.length; i++) {

			comando2 += "" + comandos_resultados[i] + ":";

		}

		// ahora vamos a dividir en comandos y solucion t los tamaños de los vectores
		// simpre sera la mitad de el string principal debio a que debe de haber un un
		// comando y valor
		String[] comandos1_resultados = comando2.split(":");
		String[] comandos_final = new String[comandos1_resultados.length / 2];
		String[] solucion = new String[comandos1_resultados.length / 2];

		int a = 0;
		int b = 0;
		for (int i = 0; i < comandos1_resultados.length; i++) {

			if (i % 2 != 0) {

				comandos_final[a] = comandos1_resultados[i];
				++a;

			} else {
				solucion[b] = comandos1_resultados[i];
				++b;
			}

		}

		// creamos la matriz
		String[][] matriz = new String[comandos1_resultados.length / 2][2];

		for (int i = 0; i < matriz.length; ++i) {

			for (int k = 0; k < matriz[0].length; ++k) {

				if (i >= 0 && k == 0) {

					matriz[i][k] = solucion[i];

				} else {
					matriz[i][k] = comandos_final[i];
				}

			}

		}
		// mostramos los datos de la matriz
		System.out.println("datos en la matriz");

		for (int i = 0; i < matriz.length; i++) {

			for (int k = 0; k < matriz[i].length; k++) {

				System.out.print(matriz[i][k] + " " + "\t");

			}

			System.out.println();

		}
		separador();

		// creamos un lista
		List<String> lista = new ArrayList<>();

		for (int i = 0; i < matriz.length; i++) {

			lista.add(matriz[i][1]);

		}

		System.out.println("lista");
		extracted(lista);

		separador();
		// lista ordena
		Collections.sort(lista);

		System.out.println("lista ordenada");
		extracted(lista);

		separador();
		// eliminamos tambien podriamos utilizar el scanner y poner dicho string en
		// contains
		System.out.println("eliminado el punto");

		for (int k = 0; k < lista.size(); k++) {

			if (lista.get(k).contains(".")) {

				lista.remove(k);

			}

		}

		extracted(lista);
		separador();
		// declaramos el vector y su tamaño
		comandos_clase ut5;
		comandos_clase[] vectorut5 = new comandos_clase[comandos1_resultados.length / 2];
		System.out.println("cargamos  los datos en el vector");

		for (int i = 0; i < matriz.length; ++i) {
			ut5 = new comandos_clase();
			for (int k = 0; k < matriz[0].length; ++k) {

				if (i >= 0 && k == 0) {
					ut5.setComando(matriz[i][k]);

				} else {
					ut5.setValor(matriz[i][k]);
				}

			}

			vectorut5[i] = ut5;

		}

		separador();

		// elegimos que comando queremos saber
		String opcion = comando_elegido(tec, vectorut5);
		// vemos el valor del comando y
		valordecomando(opcion, vectorut5);
		
		
	

	}
	//control de letras 
	private static String comprobacion_letras(Scanner tec) {
		int a2=0;
		
		String opcion1="";
		
			
		while (a2==0) {
			int b2=0;
			System.out.println("introduca el nombre del comando");
			
			 opcion1 = tec.nextLine().trim();
			
			for (int i=0; i<opcion1.length(); i++) {
				
				char valor=opcion1.charAt(i);
				
				if(Character.isLetter(valor)){
					
					++b2;
					
					
					
				}}
				
				
				
				if (opcion1.length()==b2) {
					
					++a2;
					
					
					
				}else {    System.out.println("solo letras");	tec.nextLine();        }
				
			
			
			
		}
		
	return opcion1;	
	}
//con este comando elegimos que quiere sumar el usuario y mostrar
	private static String comando_elegido(Scanner tec, comandos_clase[] vectorut5) {
		System.out.println("que comando quiere sumar");

		for (int i = 0; i < vectorut5.length; ++i) {

			System.out.println(i + " " + vectorut5[i].getComando());

		}

		

		String opcion = comprobacion_letras(tec);
		return opcion;
	}

	private static void separador() {
		System.out.println("------------------------------------------------");
	}

	private static void extracted(List<String> lista) {
		for (String l : lista) {

			System.out.println(l);

		}
	}

//con esto sacamos el valor y la suma de las letras de comando	

	public static void valordecomando(String comando1, comandos_clase vectorut5[]) {
		comandos_clase devolver;
		int suma;
		int almacenar = 0;
		for (int i = 0; i < vectorut5.length; ++i) {
			suma = 0;

			if (vectorut5[i].getComando().equals(comando1)) {
				devolver = new comandos_clase();
				suma = devolver.valordecomando(i, vectorut5);

				almacenar = i;

				System.out.println("su valor es " + vectorut5[almacenar].getValor() + "la suma de comando "+vectorut5[almacenar].getComando()+ " es " + suma);

			}

		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
