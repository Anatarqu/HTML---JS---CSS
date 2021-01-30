package programacionpc;

import java.util.Scanner;

public class TablaAscii {
    
    public static void main(String[] args) {
        CambioConversion pCambio = new CambioConversion();
        Scanner miScanner = new Scanner(System.in);
        int aCar;
        char ele;
        int opcion;
        
        do{
        System.out.println("Pulse 1 para pasar de car�cter a c�digo Ascii o "
                + "pulse 2 para convertir c�digo Ascii en car�cter.");
        opcion = miScanner.nextInt();
        }
        while(opcion >2);
        
        if(opcion == 1){
            System.out.println("Escriba el car�cter a pasar a Ascii: ");
            ele = miScanner.next().charAt(0);
            pCambio.aAscii(ele);
            System.out.println(pCambio.getAscii());
            
        }else{
            System.out.println("Escriba el c�digo Ascii a pasar a car�cter: ");
            aCar = miScanner.nextInt();
            pCambio.aCaracter(aCar);
            System.out.println(pCambio.getCaracter());
        }
    }
    
}

class CambioConversion{
    private int cambio;
    private char caracter;
    
    public void aAscii(char caracter) {
            cambio = (int)caracter;
    }
    
    public void aCaracter(int numero) {
        caracter = (char)numero;
    }
    
    public int getAscii(){
        return cambio;
    }
    public char getCaracter() {
        return caracter;
    }
}