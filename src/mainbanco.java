import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainbanco {

	public static void main(String[] args) {

		List<clientes> listaclientes = new ArrayList<>();
		List<cuenta> listacuentas = new ArrayList<>();
		Scanner tec = new Scanner(System.in);
cuenta cu;
		crear_cliente(listaclientes, tec);

		
		for (clientes a1 : listaclientes) {

			System.out.println(a1.getNombre() + " " + a1.getNif() + " " + a1.getTelefono());

		}

		
		crear_cuenta(listaclientes, listacuentas, tec);
		
		
		for (cuenta a2: listacuentas) { 
			
			System.out.println(a2.getTitular().getNombre()+" "+a2.getNumero_de_cuenta()+" "+a2.getSaldo()+" "+a2.getLimite());
			
			
			
			
			
		}
		
		
	
		System.out.println("modificar cuenta ");	
		
		int a =1;
		
		while (a==1) {
			
			System.out.println("inserte dni  ");	
			String dni = tec.nextLine();
			int z=0;
			for (int i=0; i<listacuentas.size(); i++) {
				
				if (dni.equalsIgnoreCase(listacuentas.get(i).getTitular().getNif())) {
					
					
					System.out.println((i)+listacuentas.get(i).getNumero_de_cuenta());
					
					++z;
					
				
					
					
					
					
				}
			}
			if (z>0) {
				System.out.println("lista a modificar ");
				int elegir=tec.nextInt();
				tec.nextLine();
				cu=new cuenta();
			listacuentas.get(elegir).setNumero_de_cuenta(cu.calculo_numero_cuenta());
			System.out.println("su nuevo numero es  "+listacuentas.get(elegir).getNumero_de_cuenta());
			
			System.out.println("inserte 0 para salir y 1 continuar");
			a = tec.nextInt();
			tec.nextLine();}
			
			}
			
			
			
			
			
		
		
		
		
		
for (cuenta a2: listacuentas) { 
			
			System.out.println(a2.getTitular().getNombre()+" "+a2.getNumero_de_cuenta()+" "+a2.getSaldo()+" "+a2.getLimite());
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void crear_cuenta(List<clientes> listaclientes, List<cuenta> listacuentas, Scanner tec) {
		cuenta cu;
		int a=1;
	
		while (a == 1) {
			
			System.out.println("inserte dni  ");	
			String dni = tec.nextLine();
			for (int i=0; i<listaclientes.size(); i++) {
				
				if (dni.equalsIgnoreCase(listaclientes.get(i).getNif())) {
					cu=new cuenta();
				cu.setTitular(listaclientes.get(i));
				System.out.println("inserte el limite  ");		
				cu.setLimite(tec.nextDouble());	
					tec.nextLine();
					
					System.out.println("inserte saldo  ");		
					cu.setSaldo(tec.nextDouble());	
						tec.nextLine();	
					
					
					listacuentas.add(cu);
					
					System.out.println("generando cuenta .... "+listacuentas.get(i).getNumero_de_cuenta());	
					
					
				}
				
				
				
				
			}
			System.out.println("inserte 0 para salir y 1 continuar");
			a = tec.nextInt();
			tec.nextLine();
			
		}
	}

	private static void crear_cliente(List<clientes> listaclientes, Scanner tec) {
		int a = 1;
		clientes c;
		while (a == 1) {
			int b = 0;
			c = new clientes();
			System.out.println("inserte dni del cliente");
			String dni = tec.nextLine();
			if (listaclientes.size() == 0) {

				extracted(listaclientes, tec, c, dni);

			} else {
				System.out.println("comprobando si existe el dni en la base de datos ");

				for (int i = 0; i < listaclientes.size(); i++) {

					if (dni.equals(listaclientes.get(i).getNif())) {

						System.out.println("ese dni ya existe ");

					} else {
						++b;
					}

				}

			}

			if (listaclientes.size() == b) {

				extracted(listaclientes, tec, c, dni);

			}

			System.out.println("inserte 0 para salir y 1 continuar");
			a = tec.nextInt();
			tec.nextLine();

		}
	}

	private static void extracted(List<clientes> listaclientes, Scanner tec, clientes c, String dni) {
		c.setNif(dni);
		System.out.println("inserte el nombre del cliente");
		c.setNombre(tec.nextLine());
		System.out.println("inserte el telefono ");
		c.setTelefono(tec.nextLine());

		listaclientes.add(c);
	}

}
