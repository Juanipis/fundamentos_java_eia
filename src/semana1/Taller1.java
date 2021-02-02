package semana1;

public class Taller1 {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Variables1 var1 = new Variables1();
		Variables2 var2 = new Variables2();
		Constantes1 con1 = new Constantes1();
		
		//Prueba de que se pueden declarar constantes sin inicializar
		final int NUMERO;
		NUMERO = 10;
		System.out.print(NUMERO);
	}

}

class Variables1{
	String nombre = "Juan Pablo Díaz Correa";
    char letra = 'j';
    boolean casado = false;
    byte edad = 17;
    short anio = 2021;
    int cuenta = 2147483647;
    long cedula = 3444098678l;
    String direccion = "Cra 52 ##73-75, Medellín, Antioquia";
    boolean respuesta = true;
    float peso = 65.9f;
    float altura = 1.82f;
}

class Variables2{
	float temperaturaHorno;
	float nivelTanque;
	float ph;
	int numeroPiezasDia;
	double salarioTrabajdor;
	char sexo;
	byte edad;
	boolean asistencia;
	short codigoLibro;
	double valorCompra;
	float impuestosMaquina;
	boolean estadoDeuda;
}

class Constantes1{
	final float PI = 3.1416f;
	final float GRAVEDAD = 9.8f;
	final byte NUMERO_PLANETAS = 8;
	final byte DIAS_SEMANA = 7;
}

class Operadores1{
	int cosas1 = 10;
	int cosas2 = 12;
	
	boolean verdadero = true;
	boolean falso = false;
	boolean resultado;
	
	String texto1 = "Hola Mundo ";
	String texto2 = "Sos grande ";
	
	public void OperadoresAritmeticos() {
		//Operador unario de cambio de signo
		int negativo = -15;
		int negativo2 = -cosas1;
		
		//Operador de suma
		int cosas3 = cosas1 + cosas2;
		int cosas4 = cosas2 + cosas3;
		
		//Operador de resta
		int cosas5 = cosas3 - cosas4;
		int cosas6 = cosas4 - cosas5;
		
		//Operador de producto
		int cosas7 = cosas5 * cosas6;
		int cosas8 = cosas6 * cosas7;
		
		//Operador de división
		float cosas9 = cosas7 / cosas8;
		float cosas10 = cosas8 / cosas9;
		
		//Operador de resto de división entera
		float cosas11 = cosas9 % cosas10;
		float cosas12 = cosas10 % cosas11;
		
	}
	
	public void OperadoresAritmeticosIncrementales() {
		//Incremento de unidad
		cosas1++;
		cosas2++;
		
		//Decremento de unidad
		cosas1--;
		cosas2--;
	}
	
	public void OperadoresAritmeticosCombinados()
	{
		//Suma combinada
		cosas1 += cosas2;
		cosas2 += cosas1;
		
		//Resta combinada
		cosas1 -= cosas2;
		cosas2 -= cosas1;
		
		//Producto combinado
		cosas1 *= cosas2;
		cosas2 *= cosas1;
				
		//Division combinada
		cosas1 /= cosas2;
		cosas2 /= cosas1;
		
		//Resto combinado
		cosas1 %= cosas2;
		cosas2 %= cosas1;
	}
	
	public void OperadoresRelacion() {
		//Igual que
		resultado = verdadero == verdadero;
		resultado = verdadero == falso;
		
		//Distinto que
		resultado = verdadero != verdadero;
		resultado = verdadero != falso;
		
		//Menor que
		resultado = 10 < 15;
		resultado = 7 < 5;
		
		//Mayor que
		resultado = 16 > 1;
		resultado = 4 > 7;
				
		//Menor o igual que
		resultado = 3 <= 3;
		resultado = 49 <= 2;
				
		//Mayor o igual que
		resultado = 99 >= 99;
		resultado = 43 >= 14;
	}
	
	public void OperadoresLogicos() {
		//Negación
		resultado = !verdadero;
		resultado = !falso;
				
		//Suma lógica
		resultado = verdadero | verdadero;
		resultado = verdadero | falso;

		//Suma lógica exclusiva 
		resultado = verdadero ^ verdadero;
		resultado = falso ^ falso;
				
		//Producto lógico
		resultado = verdadero & verdadero;
		resultado = verdadero & falso;
		
		//Suma lógica con cortocircuito 
		resultado = verdadero || falso;
		resultado = falso || verdadero;
		
		//Producto lógico con cortocircuito 
		resultado = verdadero && falso;
		resultado = falso && verdadero;
	}
	
	public void OperadorCondicional() {
		//Operador condicional (If Else con azucar sintactico)
		resultado = (verdadero ? verdadero : falso);
		resultado = (falso ? falso : verdadero); 
	}
	
	public void OperadoConcatenacion() {
		//Operador de concatenación de cadenas
		String texto3 = texto1 + texto2;
		String texto4 = texto1 + texto2 + texto3;
	}
}
