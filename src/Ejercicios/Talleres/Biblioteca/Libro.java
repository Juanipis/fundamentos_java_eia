package Ejercicios.Talleres.Biblioteca;

public class Libro extends Material {
  private int numeroPaginas;

  public Libro(String codigo, String nombre,boolean critico, boolean disponible, int numeroPaginas) {
    super(codigo, nombre, critico, disponible);
    this.numeroPaginas = numeroPaginas;
  }

  public double calcularMultaPorDia(){
    int valorPorPagina = this.numeroPaginas/100;
    if(valorPorPagina == 0){ valorPorPagina = 1;}
    if(getCritico()){
      
      return (int) 1250*(valorPorPagina);
    }
    else{
      return (int) 1000*(valorPorPagina);
    }
  }


  @Override
  public String toString() {
    return super.toString() + "{" +
      " numeroPaginas='" + this.numeroPaginas + "'" +
      "}";
  }

}
