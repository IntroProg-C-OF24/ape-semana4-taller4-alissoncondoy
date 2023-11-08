package ape_semanana4_soluciones;
import java.util.Scanner;
public class AreaPoligono_9 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double ladoCuadrado;
        double alturaTriangulo;
        double areaTotal;
        double areaTriangulo;
        double areaCuadrado;
        double areaRectangulo;
        System.out.println("Ingrese el lado del cuadrado");
        ladoCuadrado = dato.nextDouble();
        System.out.println("Ingrese la altura del triangualo");
        alturaTriangulo = dato.nextDouble();
        areaCuadrado=ladoCuadrado*ladoCuadrado;
        areaTriangulo = (ladoCuadrado*alturaTriangulo)/2;
        areaRectangulo = ladoCuadrado*alturaTriangulo;
        areaTotal = areaTriangulo*3+areaCuadrado+areaRectangulo;
        System.out.println("El area del poligo es: "+ areaTotal);
    }
}
