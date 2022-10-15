/*
 * Creado por Tatiana Ortega
 * Fecha 11-09-2022
 * Clase que genera Clave Aleatoria 
*/
package clavealeatoria;


public class Clave {
    
    //metodo generador de la clave
    public String  generarClave(){
        
        //variables que almacenan los caracteres que tendra la clave, minusculas, mayusculas y digitos
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String digitos = "1234567890";
        String clave = "";
        
        //Obtiene un numero aleatorio entre 8 y 15 caracteres para la longitud de la clave
        int longitud = (int)(Math.random()*(15-8+1)+8);
        
        //genera la clave con el tamaño de la longitud obtenido 
        for(int i=1; i<=longitud/3; i++){
            
            //Obtiene un numero aleatorio entre 1 y la longitud de cadena mayusculas            
            int rand = (int)(Math.random() * mayusculas.length());
            //Obtiene el caracter de acuerdo a la posicion obtenida y lo concatena a la clave
            clave += String.valueOf(mayusculas.charAt(rand));
            
            //Obtiene un numero aleatorio entre 1 y la longitud de cadena minusculas
            rand = (int)(Math.random() * minusculas.length()) ;
            //Obtiene el caracter de acuerdo a la posicion obtenida y lo concatena a la clave
            clave += String.valueOf(minusculas.charAt(rand));
            
            //Obtiene un numero aleatorio entre 1 y la longitud de cadena digitos
            rand = (int)(Math.random() * digitos.length()) ;
            //Obtiene el caracter de acuerdo a la posicion obtenida y lo concatena a la clave
            clave += String.valueOf(digitos.charAt(rand));
        }
        return clave;
    }
}
