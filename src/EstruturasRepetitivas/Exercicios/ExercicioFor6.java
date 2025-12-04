package EstruturasRepetitivas.Exercicios;

/*
    Ler um número inteiro N e calcular todos os seus divisores.
*/

import java.util.Scanner;

public class ExercicioFor6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número e descubra quais são seus divisores: ");
        int num = sc.nextInt();

        System.out.print("\nDivisores: ");
        for (int i = 1; i <= num; i++) {
            if ( num % i == 0 ) {
                System.out.printf("%d ", i);
            }
        }

        sc.close();
    }
}
