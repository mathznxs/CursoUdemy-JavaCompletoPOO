package com.mathdev.javacourse.exercicios.estruturafor;

/*
    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
*/

import java.util.Scanner;

public class ExercicioFor2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numInicial = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < numInicial; i++) {
            System.out.print("Digite o número final do intervalo: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("\nNúmeros dentro do intervalo: %d", in);
        System.out.printf("\nNúmeros fora do intervalo: %d", out);



        sc.close();
    }
}
