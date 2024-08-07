import java.util.Scanner;

public class Ex1134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true){
            int num = input.nextInt();
            if (num == 4){
                break;
            } else if (num == 1) {
                alcool += 1;
            } else if (num == 2) {
                gasolina += 1;
            } else if (num == 3) {
                diesel += 1;
            }
            else {
                continue;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
