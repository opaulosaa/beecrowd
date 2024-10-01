package lista3.ex1043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ladoA = input.nextDouble();
        double ladoB = input.nextDouble();
        double ladoC = input.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
        Trapezio trapezio = new Trapezio(ladoA, ladoB, ladoC);

        if (triangulo.formaTriangulo()){
            System.out.printf("Perimetro = %.1f\n", triangulo.calcularPerimetro());
        } else {
            System.out.printf("Area = %.1f\n", trapezio.calcularArea());
        }
    }
}
