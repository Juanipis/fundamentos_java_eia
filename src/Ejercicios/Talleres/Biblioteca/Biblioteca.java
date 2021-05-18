package Ejercicios.Talleres.Biblioteca;

public class Biblioteca {
  private Prestamo[] listaPrestamo = new Prestamo[20];
  private Material[] listaMaterial = new Material[20];
  private int cantidadPrestamo = 0;
  private int cantidadMaterial = 0;

  public Biblioteca(){}
  
  public void agregarMaterial(Material material){
    boolean anadido = false;
    for (int i = 0; i < listaMaterial.length; i++) {
      if(listaMaterial[i] == null){
        listaMaterial[i] = material;
        anadido = true;
        break;
      }
    }
    if(anadido){
      System.out.println("Material añadido con exito 📚");
      cantidadMaterial++;
    }
    else{
      System.out.println("Libreria llena 😥");
    }
  }

  public void agregarPrestamo(Prestamo prestamo){
    boolean anadido = false;
    for (int i = 0; i < listaPrestamo.length; i++) {
      if(listaPrestamo[i] == null){
        cantidadPrestamo++;
        listaPrestamo[i] = prestamo;
        anadido = true;
        break;
      }
    }
    if(anadido){
      System.out.println("Prestamo añadido con exito 🤝");
    }
    else{
      System.out.println("No hay prestamos, vuelva pronto 👎");
    }
    
  }

  public Material calcularMaterialMayorMulta(){
    double mayorValor = 0;
    Material materialMayorValor = new Material("","",false,false); //Material por defecto
    for (int i = 0; i < listaPrestamo.length; i++) {
      if(listaPrestamo[i] == null){
        continue;
      }
      else if(listaPrestamo[i].calcularMulta() > mayorValor){
        mayorValor = listaPrestamo[i].calcularMulta();
        materialMayorValor = listaPrestamo[i].obtenerMaterial();
      }
    }
    return materialMayorValor;
  }

  public double calcularMultaTotal(){
    double multaTotal = 0.0;

    for (int i = 0; i < listaPrestamo.length; i++) {
      if(listaPrestamo[i] == null){
        continue;
      }
      else{
        multaTotal += listaPrestamo[i].calcularMulta();
      }
    }
    return multaTotal;
  }

  public Prestamo[] getPrestamo(){
    return listaPrestamo;
  }
}
