package ape_semanana4_soluciones;
import java.util.Scanner;
public class PagoPrestamo_6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double montoPrestamo;
        double interesMensual;
        double totalMeses;
        System.out.println("Ingrese el monto del prestamo");
        montoPrestamo = dato.nextDouble();
        System.out.println("Inglese interes mensual");
        interesMensual = dato.nextDouble();
        totalMeses = (montoPrestamo/12) + (interesMensual);
        System.out.println("El pago mensual del prestamo va a ser:" + totalMeses);
    }    
}
