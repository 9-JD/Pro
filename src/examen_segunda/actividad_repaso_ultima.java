package examen_segunda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class actividad_repaso_ultima {

	public static void main(String[] args) {
		final int numero_elementos = 6;

		int numero_jugadores;
		List<jugadores> listajugadores = new ArrayList<>();
		jugadores jug;
		Scanner tec = new Scanner(System.in);
jugadores vetor[]=new jugadores [2];


System.out.println("inserte el numero de jugadores");
		numero_jugadores = tec.nextInt();
		tec.nextLine();
		numero_jugadores=numero_jugadores+1;
		

		String matriz_contenido[][] = new String[numero_jugadores][numero_elementos];

		matriz_contenido[0][0] = "nombre";
		matriz_contenido[0][1] = "equipo";
		matriz_contenido[0][2] = "posicion";
		matriz_contenido[0][3] = "nacionalidad";
		matriz_contenido[0][4] = "goles";
		matriz_contenido[0][5] = "ficha";

		for (int i = 1; i < matriz_contenido.length; ++i) {
			
			for (int j = 0; j < matriz_contenido[i].length; ++j) {
				tec = new Scanner(System.in);
				if (j == 0) {
					System.out.println("inserte el nombre del futbolista");

					matriz_contenido[i][j] =tec.nextLine();
                                          
				} else if (j == 1) {

					System.out.println("inserte el equipo  del futbolista");

					matriz_contenido[i][j] = tec.nextLine();

				} else if (j == 2) {

					System.out.println("inserte la pocision  del futbolista");

					matriz_contenido[i][j] =tec.nextLine();
				

				} else if (j == 3) {

					System.out.println("inserte la nacionalidad   del futbolista");

					matriz_contenido[i][j] = tec.nextLine();

				} else if (j == 4) {

					System.out.println("inserte los goles  del futbolista");

					matriz_contenido[i][j] = comprobacion_numeros(tec);

				} else if (j == 5) {

					System.out.println("inserte la ficha del futbolista");

					matriz_contenido[i][j] = comprobacion_numeros(tec);

				}

			}

		}
		
		System.out.println("matriz");
		
		
		mostrar_matriz(matriz_contenido);
		
		System.out.println();
		
		
		
	
		for (int i = 1; i < matriz_contenido.length; ++i) {
			jug = new jugadores();
			for (int j = 0; j < matriz_contenido[i].length; ++j) {

				if (j == 0) {

					jug.setNombre(matriz_contenido[i][j]);

				} else if (j == 1) {

					jug.setEquipo(matriz_contenido[i][j]);

				} else if (j == 2) {

					jug.setPosicion(matriz_contenido[i][j]);

				} else if (j == 3) {

					jug.setNacionladad(matriz_contenido[i][j]);

				} else if (j == 4) {

					jug.setGoles(matriz_contenido[i][j]);

				} else if (j == 5) {

					jug.setFicha(matriz_contenido[i][j]);

				}

			}
			listajugadores.add(jug);

		}
	
	
System.out.println("lista");
		
		mostrar_lista(listajugadores);
		
		System.out.println();
		
	
		
		

	valor_mercado(listajugadores, tec, numero_jugadores);
	
	
	
	
	
	
cambiar_pocicion(listajugadores, tec);
mostrar_lista(listajugadores);
	
	
borrar(listajugadores, tec);	
mostrar_lista(listajugadores);
	
	
	
	}	
	
	
	
	
	
	
	
	







	private static void borrar(List<jugadores> listajugadores, Scanner  tec) {
		
		
		
System.out.println("indique la nacionalidad que quieres borrar ");
		
		String na =tec.next();
		
		
		for (int i=0; i<listajugadores.size(); ++i) {
			
			if (listajugadores.get(i).getNacionladad().equalsIgnoreCase(na)) {
				
				
				listajugadores.remove(i);
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
	}








	private static void cambiar_pocicion(List<jugadores> listajugadores, Scanner  tec) {
		
		
		
		System.out.println("indique la pocision a cambiar ");
		
		String pocision =tec.next();
		
System.out.println("indique la nueva pocision  ");
		
		String pocision1 =tec.next();
		
	for (int i=0; i<listajugadores.size(); ++i) {
		
		
		if ((listajugadores.get(i).getPosicion().contains(pocision))) {
			
			String cambio= listajugadores.get(i).getPosicion();
			cambio=cambio.replaceAll(pocision, pocision1);
			 listajugadores.get(i).setPosicion(cambio);
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}	
		
		
		
		
		
		
		
		
		
		
	}








	private static void valor_mercado(List<jugadores> listajugadores, Scanner  tec, int porcentaje) {
		String ficha=jugadores_equipos(listajugadores, tec);
		
		Double valor=Double.parseDouble(ficha);
		
		
		System.out.println("su valor es de  "+(valor+((double) porcentaje/100)*valor));
		
		
		
		
		
	}








	private static String jugadores_equipos(List<jugadores> listajugadores, Scanner tec) {
		System.out.println("Buscar jugadores en equipos ");
		for (jugadores a : listajugadores) {

			System.out.println(a.getEquipo() + "   ");
		}

		System.out.println("Inser el  equpios del jugador ");

		String equipo = tec.next();

		for (int i = 0; i < listajugadores.size(); ++i) {

			if (listajugadores.get(i).getEquipo().equalsIgnoreCase(equipo)) {

				System.out.println("("+i+") nombre " + listajugadores.get(i).getNombre() + " equipo "
						+ listajugadores.get(i).getEquipo() + " ficha " + listajugadores.get(i).getFicha());

			}

		}
		System.out.println("elige el jugador que quiera  saber su precio jugador ");
		int a2 = tec.nextInt();
		tec.nextLine();
		String ficha = listajugadores.get(a2).getFicha();

		return ficha;

	}








	private static void mostrar_lista(List<jugadores> listajugadores) {
		
		for (jugadores a: listajugadores) {
			
			
			
			System.out.println("Nombre "+a.getNombre()+" Equpio "+a.getEquipo()+" nacionalidad  "+a.getNacionladad()+ " pocision  "+a.getPosicion()+" goles "+a.getGoles()+" ficha "+a.getFicha());
			
			
		}
		
	}








	private static void mostrar_matriz(String matriz [][]) {
		for (int i=0; i<matriz.length; i++) {
			
		for (int j=0; j<matriz[0].length; j++) {
			
			System.out.print("\t"+matriz[i][j]+" "+"\t");	
			
			
			
			
			
			
			
			
		}	
			
		System.out.println();		
			
			
			
		}
		
	}
























	private static String comprobacion_numeros(Scanner tec) {
		int a = 1;
		String numeros = "";
		while (a != 0) {

			try {
				numeros = tec.next();
				Double valor = Double.parseDouble(numeros);
				--a;
				return numeros;

			} catch (NumberFormatException e1) {

				System.out.println("solo numeros ");

				tec.nextLine();

			}
		}
		return numeros;
	}

}
