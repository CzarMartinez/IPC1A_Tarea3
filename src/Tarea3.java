import java.util.Scanner; 
public class Tarea3 {
	   public static void main (String args[]) { 
	int num= 0;
	boolean esPrimo = true;
	System.out.println("Ingrese un número");
	Scanner teclado = new Scanner (System.in);
	num = teclado.nextInt();
	for(int i=2; i<num; i++){
		if(num % i ==0){
		System.out.println("No es primo");
		esPrimo = false; break;
		}
	}   if(esPrimo)
	System.out.println("Es Primo");
}
}