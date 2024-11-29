package com.mycompany.somaemedia;

import java.util.Scanner;


public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        // Solicita os 10 números ao usuário
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Acumula a soma
        }

        // Calcula a média
        double media = soma / 10.0;

        // Exibe a soma e a média
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
