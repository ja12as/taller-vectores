
//Crear una aplicación que permita guardar los datos de una factura de la siguiente 
//manera: Crear 3 vectores con los siguientes datos La aplicación debe de imprimir el  
//total a pagar de los productos comprados, para ello 
//debe de tener en cuenta, que si compra más de 10 productos tiene un descuento del 5%. 

import java.util.Scanner; 

public class Factura { 
    String codigoFactura; 
    String[] codigoProducto; 
    String[] nombreProducto; 
    double[] valorUnitario; 
    int[] cantidad; 
    Factura() { 
        codigoProducto = new String[3]; 
        nombreProducto = new String[3]; 
        valorUnitario = new double[3]; 
        cantidad = new int[3]; 
    } 
    void ingresarDatos() { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingrese el codigo de factura: "); 
        codigoFactura = scanner.nextLine(); 
        for (int i = 0; i < 3; i++) { 
            System.out.println("Ingrese los datos del producto " + (i+1) + ":"); 
            System.out.print("Código de producto: "); 
            codigoProducto[i] = scanner.nextLine(); 
            System.out.print("Nombre del producto: "); 
            nombreProducto[i] = scanner.nextLine(); 
            System.out.print("Valor unitario: "); 
            valorUnitario[i] = scanner.nextDouble(); 
            System.out.print("Cantidad: "); 
            cantidad[i] = scanner.nextInt(); 
            scanner.nextLine(); 
        } 
    } 
    double calcularTotal() { 
        double total = 0; 
        for (int i = 0; i < 3; i++) { 
            total += cantidad[i] * valorUnitario[i]; 
        } 
        if (cantidadTotal() > 10) { 
            total *= 0.95; // Aplica descuento del 5% 
        } 
        return total; 
    } 
    int cantidadTotal() { 
        int cantidadTotal = 0; 
        for (int i = 0; i < 3; i++) { 
            cantidadTotal += cantidad[i]; 
        } 
        return cantidadTotal; 
    } 
    public static void main(String[] args) { 
        Factura f = new Factura(); 
        f.ingresarDatos(); 
        System.out.println("El total a pagar es: " + f.calcularTotal()); 
    } 
} 

 

 