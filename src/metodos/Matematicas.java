package metodos;
import java.io.FileWriter;
import java.util.logging.Logger;
import java.math.BigInteger;



class Factorial{
  Logger logger = Logger.getLogger(Factorial.class.getName());
  BigInteger totalFactorial = BigInteger.valueOf(1);
  public void factorial(int num, String nombreFichero){
    try(FileWriter fichero = new FileWriter(nombreFichero)) {
        BigInteger numero = BigInteger.valueOf(num);
        for (BigInteger i = BigInteger.valueOf(1); 1 == numero.compareTo(i); i = i.add(BigInteger.valueOf(1))) {
          totalFactorial = totalFactorial.multiply(i);
          numString(i);
          fichero.write(String.format("%d! = %s = %d%n" ,i,numString(i),totalFactorial));
        }
    } catch (Exception ex) {
      logger.warning("Error : " + ex.getMessage());
    }
    
    
}
  public String numString(BigInteger number){
    StringBuilder sBuilder = new StringBuilder();
    for (BigInteger i = number; 1 == i.compareTo(BigInteger.valueOf(0)); i = i.subtract(BigInteger.valueOf(1))) {
      if( 0 == i.compareTo(BigInteger.valueOf(1))){
        sBuilder.append(i.toString());
      }
      else{
        sBuilder.append(i.toString()+ " * ");
      }
    }
    return sBuilder.toString();
  }
}