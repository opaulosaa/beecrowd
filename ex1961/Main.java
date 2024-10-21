package com.paulosa.ex1961;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int P = input.nextInt();
        int N = input.nextInt();
        List<Integer> canos = new ArrayList<>();

        for (int i = 0; i < N; i++){
            canos.add(input.nextInt());
        }
        Sapo sapo = new Sapo(P, canos);
        System.out.println(sapo.determinarResultado());
    }
}
