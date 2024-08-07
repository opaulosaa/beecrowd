import java.util.Scanner;

public class Ex1151 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, proximo, atual = 1, anterior = 0;
        N = input.nextInt();

        for (int i = 1; i <= N; i++){
            if (i == N){
                System.out.println(anterior);
            }
            else {
                System.out.print(anterior + " ");
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }
    }
}
