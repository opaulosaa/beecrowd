package lista3.ex2059;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int j1 = input.nextInt();
        int j2 = input.nextInt();
        int r = input.nextInt();
        int a = input.nextInt();

        Jogo jogo = new Jogo(p, j1, j2, r, a);
        jogo.determinarVencedor();
    }
}
