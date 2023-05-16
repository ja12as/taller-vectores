 

//Para este punto se debe de implementar el ejercicio uno del taller, luego, debes de 
//adicionar una funcionalidad que permita guardar los números almacenados a otro 
//vector, pero organizándolos de mayor a menor,  

import java.util.Arrays; 
import java.util.Scanner; 

class Vector { 
    int[] numeros; 
     Vector() { 
        numeros = new int[5]; 
    } 
     void ingresarNumeros() { 
        Scanner scanner = new Scanner(System.in); 
        for (int i = 0; i < 5; i++) { 
            System.out.print("Ingrese un número: "); 
            int numero = scanner.nextInt(); 
            if (numero >= 0 && numero <= 10) { 
                numeros[i] = numero; 
            } else { 
                System.out.println("El número debe ser mayor o igual a 0 y menor o igual a 10."); 
                i--; 
            } 
        } 
    } 
    void ordenarNumeros() { 
        int[] numerosOrdenados = new int[5]; 
        Arrays.sort(numeros); 
        for (int i = 4; i >= 0; i--) { 
            numerosOrdenados[4-i] = numeros[i]; 
        } 
        System.out.println("Los números ordenados de mayor a menor son: " + Arrays.toString(numerosOrdenados)); 
    } 
    public static void main(String[] args) { 
        Vector v = new Vector(); 
        v.ingresarNumeros(); 
        v.ordenarNumeros(); 
    } 
} 