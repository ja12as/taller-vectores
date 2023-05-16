//Crear una aplicación que permita guardar 5 números en un vector, la aplicación deberá 
//evitar guardar números negativos y también números mayores a 10. 

import java.util.Scanner; 
import java.util.Arrays; 

public class Tarea_vectores_new { 
    int[] vector; 
    Tarea_vectores_new() { 

        vector = new int[5]; 
    } 
    void ingresarNumeros() { 
        Scanner scanner = new Scanner(System.in); 
        for (int i = 0; i < 5; i++) { 
            int num = -1; 
            while (num < 0 || num > 10) { 
                System.out.print("Ingrese un número: "); 
                num = scanner.nextInt(); 
                if (num < 0 || num > 10) { 
                    System.out.println("El número ingresado no es válido. Ingrese un número entre 0 y 10."); 
                } 
            } 
            vector[i] = num; 
        } 
    } 
    void mostrarVector() { 
        System.out.println("El vector final es: " + Arrays.toString(vector)); 
    }
    public static void main(String[] args) { 
        Tarea_vectores_new nv = new Tarea_vectores_new(); 
        nv.ingresarNumeros(); 
        nv.mostrarVector(); 
    } 
} 