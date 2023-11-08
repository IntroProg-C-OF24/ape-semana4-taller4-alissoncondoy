package ape_semanana4_soluciones;
import java.util.Scanner;
public class GastosHijos_2 {
    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, gastosTotales;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa los gastos del hijo 1: ");
        gastosHijo1 = dato.nextDouble();
        System.out.println("Ingresa los gastos del hijo 2: ");
        gastosHijo2 = dato.nextDouble();
        System.out.println("Ingresa los gastos del hijo 3: ");
        gastosHijo3 = dato.nextDouble();
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        System.out.println("LOS GASTOS TOTALES DE LOS TRES HIJOS SON: " + gastosTotales);
    }
}
