package ape_semanana4_soluciones;
import java.util.Scanner;
public class PlantillaLuz_7 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double costokwh;
        double kwhconsumidos;
        double costoPlanillaLuz;
        System.out.println("Ingrese el costo de kilovatios por hora");
        costokwh = dato.nextDouble();
        System.out.println("Ingrese el cosumo de kilovatios en el mes ");
        kwhconsumidos = dato.nextDouble();
        System.out.println("Ingrese el descuento para personas mayores a 65 años");
        costoPlanillaLuz = (costokwh*kwhconsumidos);
        System.out.println("El pago de la planilla de luz a pagar es: " + costoPlanillaLuz);
        System.out.println("Ingrese edad");
        int edad = dato.nextInt();
        if (edad > 65){
            costoPlanillaLuz *= 0.9;
            System.out.println("El costo a cancelar en la planilla e luz va a ser: " + costoPlanillaLuz);
        }    
    } 
}
