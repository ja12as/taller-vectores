//Crear una aplicación de consola en java que permita guardar los siguientes datos de un 
//producto: código – nombre – cantidad 
//Por cada dato del producto se debe de crear un vector ejemplo: 
//La aplicación debe de mostrar la cantidad total de productos 

import java.util.Scanner; 

class Producto { 
    String[] codigo; 
    String[] nombre; 
    int[] cantidad; 
    int cantidadTotal; 
    Producto() { 
        codigo = new String[4]; 
        nombre = new String[4]; 
        cantidad = new int[4]; 
        cantidadTotal = 0; 
    } 
    void ingresarProductos() { 
        Scanner scanner = new Scanner(System.in); 
        for (int i = 0; i < 4; i++) { 
            System.out.println("Ingrese los datos del producto " + (i+1) + ":"); 
            System.out.print("Código: "); 
            codigo[i] = scanner.nextLine(); 
            System.out.print("Nombre: "); 
            nombre[i] = scanner.nextLine(); 
            System.out.print("Cantidad: "); 
            cantidad[i] = scanner.nextInt(); 
            cantidadTotal += cantidad[i]; 
            scanner.nextLine(); 
        } 
    } 
    void mostrarCantidadTotal() { 
        System.out.println("La cantidad total de productos es: " + cantidadTotal); 
    } 
    public static void main(String[] args) { 
        Producto p = new Producto(); 
        p.ingresarProductos(); 
        p.mostrarCantidadTotal(); 
    } 
} 