package Semana13;

public class OperarNumero {
  private int numeroEntero;

  public OperarNumero(int numeroEntero) {
    this.numeroEntero = numeroEntero;
  }

  public int getNumeroEntero() {
    return this.numeroEntero;
  }

  public void setNumeroEntero(int numeroEntero) {
    this.numeroEntero = numeroEntero;
  }

  public int numeroDigitos(){
    String numeroString = this.numeroEntero+"";
    return numeroString.length();
  }

  public void mostrarInvertido(){
    String numeroString = this.numeroEntero+"";
    String resultado = "";
    for (int i = numeroString.length()-1; i >= 0;  i--) {
      resultado += numeroString.charAt(i);
    }
    System.out.println(resultado);
  }

  public boolean esPrimo(int numero){
    return (((numero == 2 || numero == 3 || numero == 5 || numero == 7) || (numero%2 !=0 && numero%3 !=0 && numero%5!=0 && numero%7!=0)) && numero!=1);
  }

  public void mostrarFactoresPrimos(){
    String factoresPrimos = "";
    int numeroTemp = this.numeroEntero;
    

    //Comprobar si es primo al principio
    if(esPrimo(numeroTemp)){
      System.out.println("1 * " + numeroTemp);
      return;
    }

    while (numeroTemp > 1){
      for (int i = 1; i < this.numeroEntero; i++) {
        if(esPrimo(i) && numeroTemp%i == 0){
          factoresPrimos += i + " * ";
          numeroTemp = numeroTemp/i;
        }
      }
      if(numeroTemp == 1){
        break;
      }
    }
    System.out.println(factoresPrimos);
  }

  
}