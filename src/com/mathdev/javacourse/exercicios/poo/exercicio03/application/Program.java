package com.mathdev.javacourse.exercicios.poo.exercicio03.application;

import com.mathdev.javacourse.exercicios.poo.exercicio03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student student = new Student();

        System.out.print("Nome: ");
        student.name = sc.nextLine();
        System.out.print("Nota do 1º bimestre: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Nota do 2º bimestre: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Nota do 3º bimestre: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Nota final: %s, %.2f pontos%n", student.name, student.finalGrade());

        if (student.isApproved()) {
            System.out.print("\nVocê passou. Parabéns!");
        } else {
            System.out.printf("\nVocê reprovou. Faltando %.2f pontos%n", student.missingPoints());
        }
        sc.close();
    }
}