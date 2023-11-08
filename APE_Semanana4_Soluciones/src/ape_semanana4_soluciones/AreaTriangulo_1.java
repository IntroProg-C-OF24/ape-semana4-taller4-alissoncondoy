package ape_semanana4_soluciones;
import java.util.Scanner;
public class AreaTriangulo_1 {
    public static void main(String[] args) {
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        Scanner dato = new Scanner(System.in); //DECLARANDO E INICIALIZAR
        System.out.println("Ingresar la base del triangulo: ");
        baseTriangulo = dato.nextDouble();
        System.out.println("Ingresar la altura del triangulo: ");
        alturaTriangulo = dato.nextDouble();
        areaTriangulo =(baseTriangulo*alturaTriangulo) / 2;
        System.out.println("El area del triangulo es: " +areaTriangulo);
    }
    
}
