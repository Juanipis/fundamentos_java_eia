package Ejercicios.Talleres.Biblioteca;

public class Main {
  public static void main(String[] args) {
    Libro libro = new Libro("001", "El señor de los anillos",true, false,10 );
    CD rapidosFuriosos = new CD("001", "Rapidos y furiosos 9", true, false, 50);
    Fecha fecha1 = new Fecha(2001,5,8);
    Fecha fecha2 = new Fecha(2002,5,23);

    Prestamo prestamoSenor = new Prestamo(libro,fecha1, fecha2);
    Prestamo presamoRapido = new Prestamo(rapidosFuriosos, fecha1, fecha2);
    
    Biblioteca biblioteca = new Biblioteca();

    biblioteca.agregarMaterial(libro);
    biblioteca.agregarPrestamo(prestamoSenor);
    biblioteca.agregarPrestamo(presamoRapido);
    System.out.println(biblioteca.calcularMultaTotal());
    System.out.println(biblioteca.calcularMaterialMayorMulta()); 

  }
}
