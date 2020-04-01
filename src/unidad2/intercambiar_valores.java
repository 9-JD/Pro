package unidad2;

import java.util.Scanner;

public class intercambiar_valores {

	public static void main(String[] args) {
		Scanner tec =new Scanner (System.in);
		
		System.out.println("inserte valor a");
		int a= tec.nextInt();
		int c =a;
		
		System.out.println("inserte valor b");
		int b= tec.nextInt();
		
		a=b;
		b=c;
		
		System.out.println(" valor de  "+a+ " y "+b);
		

	}

}
