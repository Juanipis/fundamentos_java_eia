package Ejercicios.Talleres.Biblioteca;

public class Material {
  private String codigo;
  private boolean critico;
  private boolean disponible;
  private String nombre;


  public Material(String codigo, String nombre,boolean critico, boolean disponible) {
    this.codigo = codigo;
    this.critico = critico;
    this.disponible = disponible;
    this.nombre = nombre;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public boolean getCritico() {
    return this.critico;
  }

  public boolean isCritico() {
    return this.critico;
  }

  public boolean getDisponible() {
    return this.disponible;
  }

  public boolean isDisponible() {
    return this.disponible;
  }

  public String getNombre() {
    return this.nombre;
  }
  

  public double calcularMultaPorDia(){
    return 0.0;
  }


  @Override
  public String toString() {
    return "{" +
      " codigo='" + this.codigo + "'" +
      ", critico='" + this.critico + "'" +
      ", disponible='" + this.disponible + "'" +
      ", nombre='" + this.nombre + "'" +
      "}";
  }
  
}
