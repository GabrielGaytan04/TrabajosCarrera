//Importacion de paquetes 
import java.util.Scanner;

//Nombre de la clase 
public class generador_Promedio{
    public static void main(String[] args){

	//1.DECLARACIÓN DE VARIABLES
	//I.Variable de lectura 
	Scanner lectura = new Scanner(System.in);
	//II.Variables de operacion y contención de datos
	int n; //(n representa el número de alumnos)
	int calificacion;
	int suma_calificaciones; 
	int promedio;//Representa al valor final que deseo imprimir en pantalla
	
	//2.ESTRUCTURA DE CONTROL Y ASIGNACIÓN DE VALOR PARA DATOS.
	System.out.println("Seleccione su número de alumnos:"
			   + "\n(Para terminar seleccione un valor menor a 0)");

	suma_calificaciones = 0;
	promedio = 0;
	n = lectura.nextInt(); //Asignación de valor para n 
	
	if(n<0){
	    
	    System.out.println("-1");
	    
	} else {

	    for(int grupo = n; grupo > 0; grupo--){

		System.out.println("Ingrese la calificacion final del alumno: ");
		calificacion = lectura.nextInt(); //Asignacion de valor para UNA calificacion
		suma_calificaciones += calificacion;//Asignacion de valor para la suma
		
	    } //Termina estructura for 
	    promedio= suma_calificaciones/n; //Asignacion de valor para el promedio
	    System.out.println("El promedio total de tu grupo fue: " + promedio);

	    //Impresion de mensajes de acuerdo al grupo.
	    if(promedio < 6){
		
		System.out.println("¡Houston, tenemos un problema!:0");
		
	    }else if(promedio <= 8){
		
		System.out.println("Van bien, pero pueden mejorar :) ");
		
	    }else if(promedio >= 8){
		
		System.out.println("¡Felicitaciones! a pesar de los problemas,"
				   +"lograron obtener una muy buena nota :D");
		
	    } //Termina estructura If-Else
	    

	} //Termina estructura If-Else    
		
    } //Final del método main
    
} //Final de la clase 
    
