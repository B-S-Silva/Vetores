package com.mycompany.calculomedia;


import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;


        System.out.println("Digite as 5 notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; // Acumula a soma das notas
        }

     
        double media = soma / notas.length;

 
        int acimaMedia = 0;
        int abaixoMedia = 0;
        int naMedia = 0;

       
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            } else {
                naMedia++;
            }
        }

      
        System.out.println("\nMédia das notas: " + media);
        System.out.println("Alunos acima da média: " + acimaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoMedia);
        System.out.println("Alunos exatamente na média: " + naMedia);

        scanner.close();
    }
}
