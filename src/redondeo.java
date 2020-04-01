
public class redondeo {

	public static void main(String[] args) {
		
		double numero = 15.5;
		System.out.println("Originalmente el número es: " + numero);
		// Hacia arriba si decimal es >= 5, o sea
		// 1.5 sube a 2, 1.51 sube a 2, 1.90 sube a 2
		// pero 1.49 o 1.4999999 baja a 1, igual que 1.1 o 1.2,
		// etcétera
		System.out.println("Con round: " + Math.round(numero));
		// Forzar hacia abajo sin importar decimal. Tanto 1.9 como 1.1
		// se convierten en 1
		System.out.println("Con floor: " + Math.floor(numero));
		// Lo contrario de floor. Forzar hacia arriba. Tanto
		// 1.1 como 1.9 suben a 2
		System.out.println("Con ceil: " + Math.ceil(numero));
	   
		/*
			La salida es:
				Originalmente el número es: 15.1
				Con round: 15
				Con floor: 15.0
				Con ceil: 16.0
		*/
	  }
		
		
		
		
		
		
		
		
		
		
		
		
	}


