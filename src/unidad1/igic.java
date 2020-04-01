package unidad1;

import java.util.Scanner;
/**
 * 
 * @author juand
 *
 */
public class igic {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in); 
	System.out.println("inseerte el precio  ");
	
	double a=tec.nextInt();
	
	double s1= a*0.07;
	double s2= a+s1;
	System.out.println("wl precio es "+s2);

	}

}
