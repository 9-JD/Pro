
public class cuenta {

	clientes titular;
	String numero_de_cuenta;
	double  Saldo;
	double limite;
	
	
	
	cuenta(){
	this.Saldo=0;
	numero_de_cuenta=calculo_numero_cuenta();
		
		
		
		
	}
	
	
	
		


	public clientes getTitular() {
		return titular;
	}
	public void setTitular(clientes titular) {
		this.titular = titular;
	}
	public String getNumero_de_cuenta() {
		return numero_de_cuenta;
	}
	public void setNumero_de_cuenta(String numero_de_cuenta) {
		this.numero_de_cuenta = numero_de_cuenta;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public String calculo_numero_cuenta() {
String primeros_numeros="ES211465010072";
int segundos_numeros=(int) (Math.random() * 1000000000);
String snum="";
snum=snum.valueOf(segundos_numeros);

if (snum.length()==10) {
	
	primeros_numeros=primeros_numeros.concat(snum);
	
	
	
}else {
	
int ceros=10-snum.length();	
String cantidadceros="";

for (int i=0; i<ceros; i++) {
	
cantidadceros=cantidadceros.concat(cantidadceros.valueOf(i));	
	
	
	
	
}
primeros_numeros=primeros_numeros.concat(cantidadceros).concat(snum);
	
	
	
	
}
String ultimo="";
int pos=0;
int ant=3;
for (int i=0; i<7; i++) {
	
String unido=primeros_numeros.substring(pos, ant+1 );	
ultimo+=" "+unido;	

pos=pos+3;
ant=ant+3;
	
}


		return ultimo;
	}
}
