package unidad2;

import java.util.Scanner;

public class BUCLES1 {

	public static void main(String[] args) {
		Scanner tc = new Scanner (System.in);
	int i=0;
		
		int num1 =1;
		int num2=0;
		
	
		System.out.println("while");		
while (num1>-1) {
	
	
	++i;
	num1 = extracted(tc);
	
	
	
		
}

extracted(i);

System.out.println("");
System.out.println("for ");

i=0;
num1=num2;
for (num1=num1; num1>-1;) {
	
	++i;
	
	num1 = extracted(tc);
	num2=num1;
	
	
	
}
extracted(i);



System.out.println("");
System.out.println("do-while ");


i=0;

do {
	
	
	++i;
	num1 = extracted(tc);
	
	
	
}while (num1>-1);

extracted(i);





	}

	private static void extracted(int i) {
		System.out.println(+i-1);
	}

	private static int extracted(Scanner tc) {
		int num1;
		System.out.println("inserte numero");
		num1 = tc.nextInt();
		return num1;
	}

}
