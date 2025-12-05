package EstruturasRepetitivas.Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        char resposta;
        do {
            System.out.print("Digite a temperatura em Celcius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

            System.out.print("\nDeseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
            resposta = Character.toUpperCase(resposta);
        } while (resposta != 'N');
        sc.close();
    }
}
