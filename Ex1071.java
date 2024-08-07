import java.util.Scanner;

public class Ex1071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

            if (x > y){
                int temp;
                temp = x;
                y = temp;
        }
        int soma = 0;
            for (int i = x + 1; i < y; i++){
                if (i % 2 != 0){
                    soma += i;
                }
            }
        System.out.println(soma);
    }
}
