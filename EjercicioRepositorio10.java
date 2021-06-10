//EjercicioRepositorio10
import java.util.Scanner;
public class EjercicioRepositorio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, almacenSuma = 0, contadorM6 = 0, almacenSuma1a10 = 0, faltan;

        System.out.println("Ingrese numeros enteros hasta sumar 1000");
        do {                

          System.out.println("Ingrese un numero entero: ");
          numero = entrada.nextInt();
          
            if (numero >= 0 && numero < 1001) {
                almacenSuma += numero;
                
                //multiplos de 6     
                if (numero % 6 == 0) {
                        ++contadorM6;
                    
                //menores de 10    
                }    if (numero >= 1 && numero <= 10) {
                    almacenSuma1a10 += numero;
                    
                }
            
            }
            
            faltan = (1000 - almacenSuma);
            
            System.out.println("La suma de los numeros recaudados hasta el momento es de " + almacenSuma + " y faltan " + faltan);
         
        } while (faltan != 0);
 
        System.out.println("Segun los datos recaudados");
        System.out.println("La cantidad de multiplos de 6 es de: " + contadorM6);
        System.out.println("La suma de los numeros entre 1 y 10 es de: " + almacenSuma1a10);
    }
}