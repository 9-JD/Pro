

public class comandos_clase {

	String comando;

	String valor;

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	// con esto sacamos la suma de acci
	public int valordecomando(int i, comandos_clase vectorut5[]) {

		int suma = 0;

		String valorchar = vectorut5[i].getComando();

		for (int a = 0; a < valorchar.length(); a++) {

			char s = valorchar.charAt(a);

			suma = suma + s;

		}

		return suma;

	}
}