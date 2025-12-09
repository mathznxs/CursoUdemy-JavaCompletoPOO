package com.mathdev.javacourse.fundamentos.logica;

import java.util.Scanner;

public class FuncoesSintaxes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite mais um número: ");
        int num3 = sc.nextInt();

        int higher = max(num1, num2, num3);
        showResult(higher);

        /*
            Versão Mais extensa Anterior

        if (num1 > num2 && num1 > num3) {
            System.out.printf("O número %d é maior que os números %d e %d", num1, num2, num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("O número %d é maior que os números %d e %d", num2, num1, num3);
        } else if (num3 > num1 && num3 > num2) {
            System.out.printf("O número %d é maior que os números %d e %d", num3, num1, num2);
        } else {
            System.out.print("Os números são iguais!");
        }
        */
        sc.close();
    }
    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if(b > a && b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }
    public static void showResult (int value) {
        System.out.printf("Higher: %d", value);
    }
}
