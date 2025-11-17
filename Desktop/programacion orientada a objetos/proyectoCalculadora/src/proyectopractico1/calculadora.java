
package proyectopractico1;

public class calculadora {
  // atributos encapsulados
  private double resultado;
  // getter para el resultado
  public double getresultado(){
  return resultado;
 }
  // operaciones 
 public double sumar (double a , double b){
   resultado = a + b;
      return a + b;
  
  }
public double restar (double a , double b){
    resultado = a - b;
      return a - b;
}
public double multiplicar (double a , double b){
   resultado = a * b;
      return a * b;
}
public double dividir (double a , double b){
 if (b == 0) {
 throw new ArithmeticException("no se puede dividir por cero");
 }
 return a / b;
}
  
  
    
   


}