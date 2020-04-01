package unidad2;

import java.util.Scanner;

public class BUCLES4 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int a = 1;
		int i = 0;
		int a2 = a;
		int i2 = i;
int e =0;
int e2=e;

int s=0;
int s2=s;
		System.out.println("for  ");
		for (e = e; e< 10; ++e) {

			a = extracted(tc);
			i = i + a;
			int b=a;
 s = extracted1(b, s);
			
			
		}

		extracted(i, e);
		extracted5(s);
		System.out.println(" ");
		System.out.println("while ");

		a = a2;
		i = i2;
		e=e2;
		s=s2;
		while (e != 10) {
            e++;
			a = extracted(tc);
			i = i + a;
			
			s = extracted1(a, s);
					
			
           
		}
		extracted(i, e);
		extracted5(s);
		
		System.out.println(" ");

		System.out.println("do-while");

		a = a2;
		i = i2;
		e=e2;
		s=s2;
		do {
             e++;
			a = extracted(tc);
			i = i + a;
			
			
			s = extracted1(a, s);
					

		} while (e != 10);

		extracted(i, e);
		extracted5(s);
	}

	private static void extracted5(int s) {
		System.out.println("superior a 1500 " +s);
	}

	private static int extracted1(int a, int s) {
		if (a>=1500) {
			 
			 s++;
			 
		 }
		return s;
	}

	private static void extracted(int i, int e) {
		System.out.println("la media es   " + i/e);
	}


	private static int extracted(Scanner tc) {
		int a;
		System.out.println("inserte numeros ");

		a = tc.nextInt();
		tc.nextLine();
		return a;
	}

}
