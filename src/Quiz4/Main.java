package Quiz4;

public class Main {
  public static void main(String[] args) {
    String lineaDivisora = "---------------";
    System.out.println(lineaDivisora);
    Alquier a1 = new Alquier(1, 4);
    a1.mostrarInformacion();
    System.out.println(lineaDivisora);
    Alquier a2 = new Alquier(2, 16);
    a2.mostrarInformacion();
    System.out.println(lineaDivisora);
    Alquier a3 = new Alquier(3, 47);
    a3.mostrarInformacion();
  }
}
