package unidad1;

import java.util.Scanner;

public class sueldo {

	public static void main(String[] args) {
		Scanner tec= new Scanner (System.in);
		
		
		final int h1=15;
		
		System.out.println("introducas horas trabajadas");
		int hor=tec.nextInt();
		int total=hor* h1;
		System.out.println("usted a ganado "+total+" euros ");
		
		tec.close();
	}

}
