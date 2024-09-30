/**
* CORRECCIÓN DEL CODIGO 
* Para arreglar los errores de sintaxis,
* marcaré las areas que necesité corregir.
*
*/
//1.Cambiar la declración de la clase de "Foo" a "MyFoo"
public class MyFoo{

    //2.Eliminar la letra 's' adicional en el args
    public static void main(String[] args){

	//3. Eliminar el error de notar a 10 cómo 10.0
	//Esto porque numero es un dato del tipo int. 
	int numero = 10;

	//4.Cerrar comillas en la declaración del String
	//4.1 Cambiar la declaracion minuscula de string
	String saludo = "Hello World :)";

	for(int i=0; i < numero; i++){
	    //5.Agregar comillas al final del Print.
	    System.out.println(saludo);
	}//Termina for
	
    }//Termina Main 
}//Termina clase

