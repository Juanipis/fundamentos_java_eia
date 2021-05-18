package Ejercicios.Talleres.Factura;

public class Factura {
  private String nombreTienda;
  private Cliente cliente;
  private Vendedor vendedor;
  private Producto[] listaProductos = new Producto[3];
  private int[] listaCantidadProductos= new int[3];

  public Factura(String nombreTienda, Cliente cliente, Vendedor vendedor) {
    this.nombreTienda = nombreTienda;
    this.cliente = cliente;
    this.vendedor = vendedor;
  }
  
  public void ingresarProducto(Producto producto, int cantidadProducto, int posicion) {
    listaProductos[posicion] = producto;
    listaCantidadProductos[posicion] = cantidadProducto;
  }

  public double calcularTotal(){
    double total = 0;
    double subtotalProducto = 0;
    for (int i = 0; i < listaProductos.length; i++) {
      if(listaProductos[i] == null){
        continue;
      }
      else{
        subtotalProducto = listaProductos[i].getPrecio()* listaCantidadProductos[i];
        total += subtotalProducto;
      }
    }
    return total;
  }

  public void imprimirFactura(){
    System.out.println("Tienda🔖: "+ this.nombreTienda + "\nID\tProducto\tPrecio\t\tCantidad");
    String factura = "";

    for (int i = 0; i < listaCantidadProductos.length; i++) {
      if(listaProductos[i] == null){
        continue;
      }
      else{
        factura += listaProductos[i].getId() + "\t" + listaProductos[i].getNombre() + "\t\t" +  listaProductos[i].getPrecio() + "💵\t\t" + listaCantidadProductos[i] + "\n";
      }
    }
    factura += "---------------\n";
    factura += "Precio total: " + calcularTotal() + "💰\n";
    factura += "---------------\n";
    factura += "Tipo\t\tID\tNombre\n";
    factura += "Vendedor\t" + vendedor.getId() + "\t" +  vendedor.getNombre() + "\n";
    factura += "Cliente\t\t" + cliente.getId() + "\t" +  cliente.getNombre() + "\n";
    System.out.println(factura);
  }
}
