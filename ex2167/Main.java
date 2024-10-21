package com.paulosa.ex2167;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        Motor motor = new Motor();

        for (int i = 0; i < N; i++){
            int rpm = input.nextInt();
            motor.adicionarMedida(rpm);
        }
        int resultado = motor.encontrarPrimeiraQueda();
        System.out.println(resultado);
    }
}
