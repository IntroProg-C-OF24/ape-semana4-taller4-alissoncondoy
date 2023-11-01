package ape_semana4_soluciones;
import java.util.Scanner;
public class GastoHijos_2 {
    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los gastos del hijo1: ");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Ingresa los gastos del hijo2: ");
        gastosHijo2 = teclado.nextDouble();
        System.out.println("Ingresa los gastos del hijo3: ");
        gastosHijo3 = teclado.nextDouble();
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        System.out.println("Los gastos Totales de los tres Hijos son: " + gastosTotales);
       
    }
    
}
