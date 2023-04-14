package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/*
Faça um programa leia um vetor de 6 caracteres e diga  quantas consoantes foram lidas.
Imprima as consoantes
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = new String[6];
        int quantidadeConsoantes = 0;

        for (int i = 0; i < vetor.length-1; i++) {
            System.out.println("Digite uma letra: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                vetor[quantidadeConsoantes] = letra;
                quantidadeConsoantes++;
            }

        }
        System.out.println("Consoantes: ");
        for(String consoante : vetor){
            if(consoante != null) {
                System.out.print(" " + consoante);
            }
        }

        System.out.println("\nA quantidade de consoantes é: " + quantidadeConsoantes);

    }
}
