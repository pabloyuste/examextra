/**
 * Documentación creada por Pablo Yuste del mazo.
 * Aplicación creada por IES SEVERO OCHOA 
 * 25/06/2019
 * La aplicación mide los caracteres de las palabras introducidas por parametros y 
 * les asigna una funcion en base a su tamaño.
 */
package net.ochoa.severo;

import java.io.IOException;

/**
 * 
 * @author Pablo Yuste
 *
 */
public class Medidor {

	/**
	 * Son los tipos de palabras que nos podremos encontrar
	 */
	private static final String PALABRA_CORTA = ">>>>>>> palabra corta";
	private static final String PALABRA_MEEEDIA = ">>>>> palabra meeedia";
	private static final String PALABRA_LAAAARGA = ">>> palabra laaaarga";
	private static final String PALABRA_EXTRALARGAAA = ">>> palabra exxxxtralarga";

	/**
	 * 
	 * @param Las palabras a clasificar
	 * @throws IOException
	 * Realiza el conteo de las letras.
	 */
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
	
	/**
	 * 
	 * @param De nuevo la palbra o palbras analizadas
	 * @return PALABRA EXTRALARGA
	 * @return PALABRA LARGA
	 * @return PALABRA MEDIA
	 * @return PALABRA CORTA
	 */
	private static String analiza(String a) {
		String r = "";
		switch (diagnostico(a)) {
		case 1:
			r = PALABRA_EXTRALARGAAA;
			break;
		case 2:
			r = PALABRA_LAAAARGA;
			break;
		case 3:
			r = PALABRA_MEEEDIA;
			break;
		default:
			r = PALABRA_CORTA;
		}
		return r;

	}

	/**
	 * 
	 * @param Número de caracteres calculado anteriormente.
	 * @return 1 (PALABRA EXTRALARGA)
	 * @return 2 (PALABRA LARGA)
	 * @return 3 (PALABRA MEDIA)
	 * @return 4 (PALABRA CORTA)
	 */
	private static int diagnostico(String a) {
		if (a.length() > 10) {
			return 1;
		} 
		else if (a.length() > 8) {
			return 2;
		}
		else if (a.length() > 4) {
			return 3;
		}
		else if (a.length() <= 4);
			return 4;
	}
		
}
