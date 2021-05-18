package Ejercicios.Talleres.Biblioteca;

public class Prestamo {
  private Material nombre;
  private Fecha fechaPrestamo;
  private Fecha fechaEntrega;


  public Prestamo(Material nombre, Fecha fechaPrestamo, Fecha fechaEntrega) {
    this.nombre = nombre;
    this.fechaPrestamo = fechaPrestamo;
    this.fechaEntrega = fechaEntrega;
  }

  public Material obtenerMaterial(){
    return nombre;
  }

  public int calcularDiasRetras(){
    return fechaPrestamo.calcularDiferenciaEnDias(fechaEntrega);
  }
  
  public double calcularMulta(){
    
    double total = nombre.calcularMultaPorDia()*calcularDiasRetras();
    if(total<= 0){
      return 0.0;
    }
    else{
      return total;
    }
  }

}
