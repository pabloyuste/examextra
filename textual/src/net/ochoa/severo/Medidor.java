package net.ochoa.severo;

import java.io.IOException;

public class Medidor {

	private static final String PALABRA_CORTA = ">>>>>>> palabra corta";
	private static final String PALABRA_MEEEDIA = ">>>>> palabra meeedia";
	private static final String PALABRA_LAAAARGA = ">>> palabra laaaarga";

	public static void main(String[] args) throws IOException {
		int contador = 0;
		String palabra = "";
		while (contador < args.length) {
			palabra = args[contador];
			System.out.print("'"+palabra + "' es una ");
			System.out.println(analiza(palabra));
			contador++;
		}

	}

	private static String analiza(String a) {
		String r = "";
		switch (diagnostico(a)) {
		case 1:
			r = PALABRA_LAAAARGA;
			break;
		case 2:
			r = PALABRA_MEEEDIA;
			break;
		default:
			r = PALABRA_CORTA;
		}
		return r;

	}

	private static int diagnostico(String a) {
		if (a.length() > 8) {
			return 1;
		} else if (a.length() < 4) {
			return 2;
		}
		return 3;
	}

}
