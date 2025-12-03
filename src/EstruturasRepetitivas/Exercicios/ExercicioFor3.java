package EstruturasRepetitivas.Exercicios;

/*
    Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
    de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
    conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
    peso 5.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número de casos que deseja fazer: ");
        int numCasos = sc.nextInt();

        for (int i = 0; i < numCasos; i++) {

            System.out.print("\n--------------------------------------------\n\n");

            System.out.print("Digite a nota do primeiro bimestre: ");
            double num1 = sc.nextDouble();
            System.out.print("Digite a nota do segundo bimestre: ");
            double num2 = sc.nextDouble();
            System.out.print("Digite a nota do trimestre bimestre: ");
            double num3 = sc.nextDouble();

            double soma = (num1 * 2.0 + num2 * 3.0 + num3 * 5.0) / 10;

            System.out.printf("\nO valor da média deste conjunto de notas é: %.1f%n", soma);
        }

        sc.close();
    }
}
