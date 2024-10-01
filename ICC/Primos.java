import java.util.Scanner;
public class Primos{
	public static void main(String[] args){

	    //Declaración Scanner
	    Scanner lectura = new Scanner(System.in);
	    //Declaración del numero
	    int num;

	    //Mensaje en pantalla
	    System.out.println("Ingresa el valor del numero:");
	    num = lectura.nextInt();
	    
	    //Estructura de ifs
	    if(num%2 == 0){
	       System.out.println("El número no es primo");
	       
	    }else if(num%1 == 0 && num%num == 0){
		
		System.out.println("El número es primo");
		
	    } else if(num%3 == 0 || num%5 == 0 || num%7 == 0  || num%9 == 0){

		    System.out.println("El número es impar");

		    }//Termina caso alterno si es que el número divide a otro 
	    
      }//Termina Método Main

}//Termina clase
     
