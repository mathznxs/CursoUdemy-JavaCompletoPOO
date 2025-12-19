package com.mathdev.javacourse.exercicios.poo.exercicio04.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account (int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    public void deposit (double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount + 5;
    }
    @Override
    public String toString() {
        return "Account, "
                + number
                + ", Holder: "
                + holder
                + ", Balance: R$"
                + String.format("%.2f", balance);
    }
}