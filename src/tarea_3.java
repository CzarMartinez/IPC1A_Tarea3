import java.util.Scanner;
public class tarea_3 {	
		   public static void main (String args[]) { 
		int num= 0; 
		   System.out.println("ingrese un n�mero");
		   Scanner teclado = new Scanner(System.in);
		   num=teclado.nextInt();
		   if(num % 2 ==0){			   		   
		   System.out.println("Es N�mero Par");
		   }
		   else{
			   System.out.println("Es N�mero Impar");    
		   }
		   }
}
		     
		   
