package lista2.ex2221;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for (int i = 0; i < T; i++){
            int B = input.nextInt();

            int A1 = input.nextInt();
            int D1 = input.nextInt();
            int L1 = input.nextInt();
            Pomekon pomekonDabriel = new Pomekon(A1, D1, L1);

            int A2 = input.nextInt();
            int D2 = input.nextInt();
            int L2 = input.nextInt();
            Pomekon pomekonGuarte = new Pomekon(A2, D2, L2);

            Batalha batalha = new Batalha(pomekonDabriel, pomekonGuarte, B);
            System.out.println(batalha.determinarVencedor());
        }
    }
}
