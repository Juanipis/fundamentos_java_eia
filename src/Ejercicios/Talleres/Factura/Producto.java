package Ejercicios.Talleres.Factura;

public class Producto {
  private String nombre;
  private String id;
  private double precio;

  public Producto(String nombre, String id, double precio) {
    this.nombre = nombre;
    this.id = id;
    this.precio = precio;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getId() {
    return this.id;
  }

  public double getPrecio() {
    return this.precio;
  }
  
}
