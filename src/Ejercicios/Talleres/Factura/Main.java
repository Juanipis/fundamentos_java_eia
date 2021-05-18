package Ejercicios.Talleres.Factura;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Pedro Zapata", "001");
    Vendedor vendedor = new Vendedor("Juan Álvarez", "002");

    Producto leche = new Producto("Leche🥛", "1", 1400);
    Producto pan = new Producto("Pan🍞", "2", 4500);
    Producto carne = new Producto("Carne🍖", "3", 10000);

    Factura factura = new Factura("El barrio", cliente, vendedor);
    factura.ingresarProducto(leche, 4, 0);
    factura.ingresarProducto(pan, 2, 1);
    factura.ingresarProducto(carne, 2, 2);

    factura.imprimirFactura();

  }
}
