import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cont = 0;

        for (int i = 0; i < n; i++){
            int numero = input.nextInt();
            if (numero >= 10 && numero <= 20){
                cont++;
            }
        }
        System.out.printf("%d in\n", cont);
        System.out.printf("%d out\n", n - cont);
    }
}
