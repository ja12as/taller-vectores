
package ejercicios_matrices;

import java.util.Scanner;

public class Ejercicios_matrices {
    
int [][] matriz_num;
int filas, columnas,f,c,suma;
Scanner cap;
Ejercicios_matrices(){
    filas = 0;
    columnas = 0;
    f = 0;
    c= 0;
    suma = 0;
    cap = new Scanner(System.in);
}

 void crear_y_llenar(){
     System.out.println("Digite el tamaño de las filas"); 
     filas = cap.nextInt();
     System.out.println("Digite el tamaño de las columnas");
     columnas = cap.nextInt();
     
     matriz_num= new int [filas][columnas];
     c=0;
     while(f<filas){
         System.out.println("fila #"+f);
         
         while(c<columnas){
             System.out.println("digite el dato en posicion fila #"+f+" columna#" +c);
             matriz_num[f][c]=cap.nextInt();
             suma += matriz_num[f][c];
             c++;
         }
         f++;
     }
     System.out.println("la suma de los numeros es " + suma); 
 }
    public static void main(String[] args) {
      Ejercicios_matrices em = new Ejercicios_matrices();
      em.crear_y_llenar();
    }
    
}
