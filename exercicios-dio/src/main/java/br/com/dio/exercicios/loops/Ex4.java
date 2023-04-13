package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números
impares.
 */
public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int N = scanner.nextInt();

        int countPar = 0;
        int countImpar = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                countPar++;
            }else {
                countImpar++;
            }
        }
        System.out.println("Pares: " + countPar);
        System.out.println("Impares: " + countImpar);
    }
}
