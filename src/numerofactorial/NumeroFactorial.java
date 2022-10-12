
package numerofactorial;

import java.util.Scanner;


public class NumeroFactorial {

   
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scan.nextInt();
        
        Factorial factorial = new Factorial();
        int resultado = factorial.calcularFactorial(numero);
        System.out.println("El factorial es: " + resultado);

    }
    
}
