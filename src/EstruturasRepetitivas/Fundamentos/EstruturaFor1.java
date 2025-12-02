package EstruturasRepetitivas.Fundamentos;

import java.util.Scanner;

public class EstruturaFor1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja somar: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.printf("\nSoma: %d", soma);

    }
}
