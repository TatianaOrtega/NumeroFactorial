/*
 * Creado por Tatiana Ortega
 * Fecha 11-09-2022
 * Calcula un numero factorial
*/
package numerofactorial;

import java.util.Scanner;


public class NumeroFactorial {

   
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        //Solicita ingreso de numero entero
        System.out.println("Ingrese un numero");
        int numero = scan.nextInt();
        
        //Instacia del objeto factorial
        Factorial factorial = new Factorial();
        //Llamada al metodo que realiza el factorial
        int resultado = factorial.calcularFactorial(numero);
        //Muestra en pantalla el numero factorial
        System.out.println("El factorial es: " + resultado);

    }
    
}
