package com.mycompany.busca;

import java.util.Scanner;


public class Busca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

       
        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

       
        System.out.print("\nDigite o nome que deseja buscar: ");
        String nomeBuscado = scanner.nextLine();

        
        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) { 
                System.out.println("O nome \"" + nomeBuscado + "\" foi encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

       
        if (!encontrado) {
            System.out.println("O nome \"" + nomeBuscado + "\" não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
