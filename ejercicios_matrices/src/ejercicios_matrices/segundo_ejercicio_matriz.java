
package ejercicios_matrices;

import java.util.Scanner;

public class segundo_ejercicio_matriz {
    int [][] matriz;
    int filas, columnas,f,c,promedio,suma;
    Scanner cap;
    segundo_ejercicio_matriz(){
         filas = 0;
    columnas = 0;
    f = 0;
    c = 0;
    suma = 0;
    promedio =0;
    cap = new Scanner(System.in);
    }
    void suma_promedio(){
        System.out.println("Digite el tamaño de las filas"); 
        filas = cap.nextInt();
        System.out.println("Digite el tamaño de las columnas");
        columnas = cap.nextInt();
         matriz= new int [filas][columnas];
        c=0;
        while(f<filas){
            
            while(c<columnas){
                System.out.println("digite el dato en posicion fila #"+f+" columna#" +c);
                matriz[f][c]=cap.nextInt();
                suma += matriz[f][c];
                c++;
            }
            f++;
        }
        System.out.println("la suma de los numeros es " + suma); 
    }
    public static void main(String[] args) {
        segundo_ejercicio_matriz sem = new segundo_ejercicio_matriz();
        sem.suma_promedio();
    }
}
