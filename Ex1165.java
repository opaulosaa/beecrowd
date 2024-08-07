import java.util.Scanner;

public class Ex1165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, count, n;
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            count = 0;
            x = input.nextInt();

            for (int j = 2; j < x; j++){
                if (x % j == 0){
                    count++;
                }
            }
            if (count == 0){
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }

    }
}
