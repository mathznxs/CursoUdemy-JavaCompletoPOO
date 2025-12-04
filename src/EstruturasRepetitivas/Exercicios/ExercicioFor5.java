package EstruturasRepetitivas.Exercicios;

/*
    Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    Lembrando que, por definição, fatorial de 0 é 1.
*/

import java.util.Scanner;

public class ExercicioFor5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para descobrir sua respectiva fatorial: ");
        int num = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.printf("A fatorial de %d é: %d", num, fatorial);

        sc.close();
    }
}
