package programacionpc;
import java.util.Scanner;  

public class Primos { 

public static void main(String [] args) { 
    Scanner entrada = new Scanner(System.in); 
    int a = 0, i, primo; 
    System.out.print("Digite un n�mero:"); 
    primo = entrada.nextInt(); 
    for (i = 1; i <= primo; i++) { 
        if (primo % i == 0) { 
            a++; 
        } 
    } 

  
    if (a == 2) { 
    System.out.print ("El n�mero es primo"); 
    } 
    else { 
    System.out.print ("El n�mero no es primo"); 
    }     
  } 
} 
