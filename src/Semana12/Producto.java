package Semana12;
import java.util.Scanner;

public class Producto {
  String nombre;
  double precio;
  double descuento;
  double IVA = 19;

  public Producto(Scanner eScanner){
    System.out.print("Ingrese el nombre del producto: ");
    this.nombre = eScanner.next();
    System.out.print("Ingrese el precio del producto: 💲");
    this.precio = eScanner.nextDouble();
    System.out.print("Ingrese el descuento del producto: 💸");
    this.descuento = eScanner.nextDouble();
  }
  private double calcularSubtotal(){
    return this.precio-((this.precio*this.descuento)/100);
  }
  private double calcularTotal(){
    return calcularSubtotal()+((calcularSubtotal()*this.IVA)/100);
  }

  public String getSubtotal(){
    
    return "Subtotal del producto: " + this.nombre +"\n"+
            "Valor: 💲"  + this.precio +"\n"+
            "Descuento: 💸" + this.descuento+"\n"+
            "SubTotal: 💵" + calcularSubtotal() + "\n";
  }
  public String getTotal(){
    
    
    return "Total del producto: " + this.nombre +"\n"+
            "Valor: 💲"  + this.precio +"\n"+
            "Descuento: 💸" + this.descuento+"\n"+
            "SubTotal: 💵" + calcularSubtotal() + "\n"+
            "-----------------------------------\n"+
            "IVA: 🏰" + this.IVA+"\n"+
            "-----------------------------------\n"+
            "Total: 💰" + calcularTotal() ;
  }

  public void imprimirSubtotal(){
    String separador = "*******************";
    System.out.println(separador);
    System.out.println(getSubtotal());
    System.out.println(separador);
  }

  public void imprimirTotal(){
    String separador = "*******************";
    System.out.println(separador);
    System.out.println(getTotal());
    System.out.println(separador);
  }
  public void imprimirSubTotalYTotal(){
    imprimirSubtotal();
    imprimirTotal();
  }
}
