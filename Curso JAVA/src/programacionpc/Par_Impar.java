package programacionpc;
import java.util.*; 

public class Par_Impar {
	    public static void main(String[] args) { 

	        System.out.println("------------------------------------------------------------------------------------------"); 
	        System.out.println("--N�MERO PAR O IMPAR--"); 
	        System.out.println("------------------------------------------------------------------------------------------"); 
	        Scanner input_num = new Scanner(System.in);   
	       System.out.println("Ingrese un n�mero entero:");  
	        System.out.println("-----------------------------------------------"); 
	        int entero = input_num.nextInt(); 
	        System.out.println("-----------------------------------------------");
	        int res = entero%2; 
	        if (res == 0) {
	        	
	        System.out.println("Es un n�mero par"); 
	        }
	    else  {

	        System.out.println("Es un n�mero impar"); 

	    } 

	} 
}
