package programacionpc;
import java.util.Scanner; 

public class Busqueda {
    public static void main(String[] args) { 
    	
        Scanner entrada = new Scanner(System.in); 
        System.out.print("Cantidad elementos del arreglo: "); 
        
        int size = entrada.nextInt(); 
        int[] arreglo;  
        arreglo = new int[size]; 

        System.out.printf("%s%8s\n", "Indice","Valor" ); 
        for (int contador = 0; contador < arreglo.length; contador++) 
            { 
            System.out.printf( "%5d%8d\n", contador, arreglo[contador]+1+contador); 
            } 

        System.out.print("Digite el n�mero para saber la posici�n dentro arreglo: "); 
        int num = entrada.nextInt(); 
        System.out.println("La posici�n del n�mero es: " +(num-1)); 
    } 
} 