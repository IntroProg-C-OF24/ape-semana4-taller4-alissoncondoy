package ape_semanana4_soluciones;
import java.util.Scanner;
public class PlantillaTelefono_4 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double costoPlantilla;
        double costoMinutos;
        double totalPagar;
        System.out.println("Ingrese el costo de la plantilla de luz");
        costoPlantilla = dato.nextDouble();
        System.out.println("Ingrese el costo de los minutos utilizados");
        costoMinutos = dato.nextDouble();
        totalPagar = costoPlantilla*costoMinutos;
        System.out.println("El costo de la plantilla a pagar es" + totalPagar); 
    }
    
}
