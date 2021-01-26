/*
	*Autor: Juan Pablo D�az Correa
	*GitHub: @Juanipis
	*Twitter: @Juanipis
	*Date: 26/01/2021
*/
package semana1;

public class Clase1 {

	public static void main(String[] args) {
		/*
		 * Secuencias de escape
		 *  \n = Salto de linea
		 *  \t = Espaciado horizontal
		 *  \" = Imprimir comillas
		 *  \\ = Muestra el backslash
		 */
		System.out.print("HOLA MUNDO! \n");
		System.out.print("Esta es mi segunda linea de \t codigo \n");
		System.out.print("Para palabras raras \"Zumbambico\" \n");
		
		/*
		 * Formatos de escritura para printf()
		 * %s = Cadenas de caracteres
		 * %d = Valores enteros
		 * %f = Valores reales
		 * %b = Booleans
		 */
		System.out.printf("Mi nombre es %s, mi edad es %d y peso %f \n", "Juan Pablo", 17, 75.6);
		
		/*
		 * Tipos de variables:
		 * 		Enteros:
		 * 				byte : Minimum value -128, Maximum value 127 (inclusive)
		 *				short: Minimum value -32768, Maximum value 32767
		 *				int: Minimum value -2147483648, Maximum value 2147483647
		 *				long: Minimum value -9223372036854775808, Maximum value 9223372036854775807
		 *		Reales:
		 *			   	float: Minimum value 1.4E-45, Maximum value 3.4028235E38
		 *				double: Minimum value 4.9E-324, Maximum value 1.7976931348623157E308
		 *		Texto:
		 *				String: Cadenas de texto "hola mundo"
		 *				char: Caracteres 'a'
		 *		Booleano:
		 *				true: Verdadero
		 *				false: Falso
		 */
		String nombre = "Juan Pablo";
		byte edad = 35;
		float estatura;
		estatura = 1.75f;
		double peso = 50;
		boolean casado = false;
		char sexo = 'M';
		
		System.out.printf("Nombre: %s, Edad: %d, Estatura: %f, Peso: %f, Casado: %b, Sexo: %s \n"
						 ,nombre, edad, estatura, peso, casado, sexo);
		
		/*
		 * Variables constantes
		 * Se usa "final" para no modificar valores al final
		 * Se usa nomenclatura UPPER_CASE
		 */
		final float PI = 3.14f;
		System.out.println(PI);

		System.out.println("Esto son cosas mias sjskjs");
	}

}
