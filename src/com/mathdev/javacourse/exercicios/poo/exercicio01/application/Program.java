package com.mathdev.javacourse.exercicios.poo.exercicio01.application;

import com.mathdev.javacourse.exercicios.poo.exercicio01.entities.Rectangle;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle data\n");
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("\nArea: " + rectangle.Area());
        System.out.println("Perimeter: " + rectangle.Perimeter());
        System.out.println("Diagonal: " + rectangle.Diagonal());
    }
}
