package unidad1;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class km {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		
double horat=0;
double horat0=1;
DecimalFormat formato = new DecimalFormat("#.00");
final int limite=80;

while (horat0>horat) {
		
	
	try {
	
	System.out.println("inserte la hora de entrada  ");
		double hora =tec.nextDouble();
		tec.nextLine();
		double hora1 =  hora*3600; 
		System.out.println("inserte los minutos de entrada ");
		double min =tec.nextDouble();
		double min1 =  min*60; 
		tec.nextLine();
		System.out.println("inserte los segundos de entrada");
		double seg =tec.nextDouble();
		tec.nextLine();
		
		horat=(hora1+min1+seg)/3600;
	
	
	System.out.println("inserte la hora de salida");
	double hora0 =tec.nextDouble();
	
	double hora01 =  hora0*3600; 
	tec.nextLine();
	System.out.println("inserte los minutos de salida ");
	double min0 =tec.nextDouble();
	double min01 =  min0*60; 
	tec.nextLine();
	
	System.out.println("inserte los segundos de salida ");
	double seg0 =tec.nextDouble();
	tec.nextLine();
	
		horat0=(hora01+min01+seg0)/3600;
if (horat0>horat) {
	double horaf= (horat0-horat);
	double velocidad = 3.2 /horaf;
if (velocidad>limite) {System.out.println("su velocidad ha sido de "+formato.format(velocidad)+ "se le multara");}

else {System.out.println("velocidad adecuada");}
	
	
}else {System.err.println("las horas son incorrectas la hora de salida es menor a de la entrada");}
		
	}catch (InputMismatchException e1 ) {
		
		System.err.println("introduzca numeros no caracteres " +e1.getMessage());
		tec.nextLine();
		
	}
	
}	
	
	
	tec.close();
	
	}

}
