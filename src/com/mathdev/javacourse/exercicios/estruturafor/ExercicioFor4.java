package com.mathdev.javacourse.exercicios.estruturafor;

/*
    Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

         System.out.print("Digite a quantidade de divisões: ");
         int quantDivisao = sc.nextInt();

         for (int i = 0; i < quantDivisao; i++) {
             System.out.print("\n-----------------------------------\n\n");

             System.out.print("Digite o valor do número divisível: ");
             int divisivel = sc.nextInt();
             System.out.print("Digite o valor do número divisor: ");
             int divisor = sc.nextInt();

             if (divisor == 0) {
                 System.out.print("\nDivisão Impossível!\n\n");
             } else {
                 double soma = (double) divisivel / divisor;
                 System.out.printf("\n%.1f%n\n\n0", soma);
             }
         }
        sc.close();
    }
}
