package programacionpc;
import java.util.*; 

public class Cuaderno {
	 
 public static void main(String[] args) {
	        System.out.println("-- PROGRAMA CUADRITOS POR P�GINA --");
	                Scanner datoA = new Scanner(System.in);
	        System.out.println("Ingrese el largo de la p�gina en cent�metros:"); 
	        System.out.println("---------------------------------------------");
	        double a = datoA.nextDouble();
	        System.out.println("---------------");
	        
	        Scanner datoB = new Scanner(System.in);
	        System.out.println("Ingrese el ancho de la p�gina en cent�metros:"); 
	        System.out.println("---------------------------------------------");
	        double b = datoA.nextDouble();
	        System.out.println("---------------");
	        
	        double cuadricula_a = ((a-2)/0.5);
	        System.out.println(cuadricula_a + " Cuadritos en lo largo de la p�gina.");
	        
	        double cuadricula_b = ((b-1)/0.5);       
	        System.out.println(cuadricula_b + " Cuadritos en lo ancho de la p�gina.");
	        System.out.println("---------------------------------------------");
	        
	        System.out.println((cuadricula_a * cuadricula_b) + " Total Cuadritos en la p�gina.");
	        System.out.println("---------------------------------------------");
	        
	        }
	 }
