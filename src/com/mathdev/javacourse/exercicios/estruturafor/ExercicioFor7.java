package com.mathdev.javacourse.exercicios.estruturafor;

/*
    Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
    começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
    exemplo
*/

import java.util.Scanner;

public class ExercicioFor7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }

        sc.close();
    }
}
