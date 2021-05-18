package Ejercicios.Talleres.Biblioteca;

public class Revista extends Material {
  private String area;
  public Revista(String codigo, String nombre,boolean critico, boolean disponible, String area) {
    super(codigo, nombre, critico, disponible);
    this.area = area;
  }

  public double calcularMultaPorDia(){
    if(area.equalsIgnoreCase("ciencia")){
      return 1000;
    }
    else if(area.equalsIgnoreCase("deporte")){
      return 15000;
    }
    else if(area.equalsIgnoreCase("salud")){
      return 2000;
    }
    else{
      return 500;
    }
  }


  @Override
  public String toString() {
    return super.toString() + "{" +
      " numeroPaginas='" + this.area + "'" +
      "}";
  }
}
