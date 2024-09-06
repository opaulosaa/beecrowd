package lista2.ex2434;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int S = input.nextInt();

        ContaVovo contaVovo = new ContaVovo(S);

        for (int i = 0; i < N; i++){
            int movimentacao = input.nextInt();
            contaVovo.movimentacaoDiaria(movimentacao);
        }
        System.out.println(contaVovo.getMenorSaldo());
    }
}
