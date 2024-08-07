import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -99999999;
        int posicao = 0;

        for (int i = 1; i <= 100; i++){
            int num = input.nextInt();
            if (num > max){
                max = num;
                posicao = i;
            }
        }
        System.out.println(max);
        System.out.println(posicao);
    }
}
