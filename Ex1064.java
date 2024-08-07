import java.util.Scanner;

public class Ex1064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num;
        float soma = 0;
        int contador = 0;

        for (int i = 0; i < 6; i++){
            num = input.nextFloat();
            if (num >= 0){
                soma += num;
                contador++;
            }
        }
        System.out.printf("%d valores positivos\n", contador);
        System.out.printf("%.1f\n", (soma/contador));
    }
}

