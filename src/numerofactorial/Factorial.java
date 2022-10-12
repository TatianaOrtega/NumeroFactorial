
package numerofactorial;


public class Factorial {
    
    public int calcularFactorial(int n){
        if (n<=1){
            return 1;
        }
        return n * calcularFactorial(n-1);
    }
}
