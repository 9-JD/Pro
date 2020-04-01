package unidad1;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		Scanner tec =new Scanner (System.in);
		
int i=0;
		

		
		while (i<3) {
				
		System.out.println("inserte numero");
		int num1= tec.nextInt();
		tec.nextLine();
		
		if (num1%2==0) {
			
			System.out.println("el numero "+num1+" es par ");		}

else {System.out.println( "es impar"); }
		
		++i;	
		
		}
		
		tec.close();
}}
