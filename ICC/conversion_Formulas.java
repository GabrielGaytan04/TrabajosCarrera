import java.lang.Math;
import java.util.Scanner;

public class conversion_Formulas{
  public static void main(String args[]) {
      
     
    //1.DECLARACIÓN DE VARIABLES
    //Declaración del Scanner
    Scanner lectura = new Scanner(System.in);
    //Variables que operaremos
    double x;
    double y;
    double z;
    double a;
    //Variables en las que guardaremos los resultados
    double operacion_A;
    double operacion_B;
    double operacion_C;

    //2.ASIGNACIÓN DE VALOR PARA LAS OPERACIONES 
    System.out.println("Ingresa el valor de x: ");
    x = lectura.nextInt();
    System.out.println("Ingresa el valor de y: ");
    y = lectura.nextInt();
    System.out.println("Ingresa el valor de z: ");
    z = lectura.nextInt();
    System.out.println("Ingresa el valor de a: ");
    a = lectura.nextInt();
    
    //Operacion Inciso 1 
    operacion_A = (-y-4 * x*z) / (2 * x);
    //Operación Inciso 2 
    operacion_B = (x * y - 2) / (4 - x) - (23 * x + 3) / (5 % y);
    //Operación Inciso 3 
    operacion_C = (x - y) * ((78 * z) - (a * a)) / (z + 2 * (2-x));

    //3.ENTREGA DE RESULTADOS 
    System.out.println("Resultados Ejercicio 1 son: "
                        + "\nInciso a = " + operacion_A
                        + "\nInciso b = " + operacion_B
                        + "\nInciso c =" + operacion_C
			);
  
  } //Termina Main
} //Termina Clase

