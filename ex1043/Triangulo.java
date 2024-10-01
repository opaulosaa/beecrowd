package lista3.ex1043;

public class Triangulo extends Poligono{
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    public double calcularPerimetro(){
        return (ladoA + ladoB + ladoC);
    }

}
