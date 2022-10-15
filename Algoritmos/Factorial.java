/*
 * Creado por Tatiana Ortega
 * Fecha 11-09-2022
 * Numero factorial con recursividad
*/
package numerofactorial;


public class Factorial {
    //Metodo que realiza el calculo con recursividad y recibe un numero 
    public int calcularFactorial(int n){
        //Valida cuando llegue a 1 para retornar 
        if (n<=1){
            return 1;
        }
        //Calcula la multiplicacion del numero recibido por todos los numeros anteriores     
        return n * calcularFactorial(n-1);
    }
}
