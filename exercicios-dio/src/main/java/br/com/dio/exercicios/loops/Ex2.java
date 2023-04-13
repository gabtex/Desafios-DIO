package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre  uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        while (true) {
            System.out.println("Digite uma nota: ");
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                break;
            }
            System.out.println("Número inválido!");
        }
        System.out.println("Término do programa");
    }
}
