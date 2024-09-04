package lista2.ex1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();

        vendedor.setNome(input.nextLine());
        vendedor.setSalario(input.nextDouble());
        vendedor.setValorVendas(input.nextDouble());
        vendedor.calcularBonus();
    }
}
