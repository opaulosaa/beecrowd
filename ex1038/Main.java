package lista2.ex1038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lanche lanche = new Lanche();

        lanche.setCodigo(input.nextInt());
        lanche.setQuantidade(input.nextInt());
        lanche.total();

    }
}
