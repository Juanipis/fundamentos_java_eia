package Ejercicios.Talleres.Biblioteca;

public class CD extends Material{
  private int tamanio;
  public CD(String codigo, String nombre,boolean critico, boolean disponible, int tamanio) {
    super(codigo, nombre, critico, disponible);
    this.tamanio = tamanio;
  }

  public double calcularMultaPorDia(){
    int valorPorTamanio = this.tamanio/50;
    if(valorPorTamanio == 0){ valorPorTamanio = 1;}
    return (int) 1500*(this.tamanio/50);
  }


  @Override
  public String toString() {
    return super.toString() + "{" +
      " numeroPaginas='" + this.tamanio + "'" +
      "}";
  }
}
