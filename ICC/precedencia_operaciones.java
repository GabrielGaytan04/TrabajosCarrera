import java.util.Scanner;

public class precedencia_operaciones{
  public static void main(String args[]) {
      
     
    //1.DECLARACIÓN DE VARIABLES
    Scanner lectura = new Scanner(System.in);
    int x;
    int y;
    int z;
    int operacion_A;
    int operacion_B;
    int operacion_C;
    int modulo;

    //2.ASIGNACIÓN DE VALOR PARA LAS OPERACIONES 
    System.out.println("Ingresa el valor de x: ");
    x = lectura.nextInt();
    System.out.println("Ingresa el valor de y: ");
    y = lectura.nextInt();
    System.out.println("Ingresa el valor de z: ");
    z = lectura.nextInt();
    
    operacion_A = x % y - 3 * 5/z;
    operacion_B = 5 + y + 6/x + 1 * z - 2;
    operacion_C = 45 % 4 * 2/x + 25 * (x - y);
    modulo = x % y;
   
    //3.ENTREGA DE RESULTADOS 
    System.out.println("Resultados Ejercicio 1 son: "
                        + "\nInciso a =" + operacion_A
                        + "\nInciso b =" + operacion_B
                        + "\nInciso c =" + operacion_C
			+ "\nModulo de X y Y = " + modulo);
  }
}
