package unidad1;

import java.util.Scanner;

public class mayor_numeros {

	public static void main(String[] args) {
		Scanner tec= new Scanner (System.in);
		
		System.out.println("introduca numero 1");
		double num1=tec.nextDouble();
		System.out.println("introduca numero 2");
		double num2=tec.nextDouble();
		
		
		if (num1>num2) {
			System.out.println("es mayor el numero1 " +num1);	
			
			
			
		}
		
		else if (num1<num2){
			
			System.out.println("es mayor el numero2 " +num2);
			
			
		}
		
		else {System.out.println("son iguales " +num1+ " y " +num2);}
		
		
tec.close();
	}

}
