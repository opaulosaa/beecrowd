package lista3.ex1043;

public class Trapezio extends Poligono{
    public Trapezio(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    public double calcularArea(){
        return ((ladoA + ladoB) * ladoC) / 2;
    }
}
