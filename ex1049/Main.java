package com.paulosa.ex1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tipoDeEsqueleto = input.nextLine();
        String tipoDeAnimal = input.nextLine();
        String tipoDeAlimentacao = input.nextLine();

        Animal animal = new Animal(tipoDeEsqueleto, tipoDeAnimal, tipoDeAlimentacao);

        animal.definirAnimal();



    }
}
