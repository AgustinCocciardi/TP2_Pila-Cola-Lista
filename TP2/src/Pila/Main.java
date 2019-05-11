package Pila;

public class Main {

	public static void main(String[] args) {
		PilaDinamica<String> pila = new PilaDinamica<String>();
		pila.push("Sofia");
		System.out.println(pila.peek());
	}

}
