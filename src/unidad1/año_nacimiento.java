package unidad1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class año_nacimiento {

	public static void main(String[] args) {
		Scanner tec= new Scanner (System.in);
		
final int year=LocalDate.now().getYear();


System.out.println("iserte edad e naciomiento");
int año=tec.nextInt();
tec.nextLine();
int edad =year -año;

if (edad>=18) {System.out.println("mayor de edad "+edad);}else
{System.out.println("es menor de edad de edad "+edad);}
		
		

	}

}
