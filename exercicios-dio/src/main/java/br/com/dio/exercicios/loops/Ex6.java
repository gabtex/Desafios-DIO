package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule  o fatorial de um número inteiro fornecido pelo usuário.
Ex: 5! = 120
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do fatorial que deseja calcular: ");
        int fatorial = scanner.nextInt();
        int resultado = 1;

        for(int i = fatorial; i >= 1; i--){
            resultado = resultado * i;
        }
        System.out.println(fatorial + "!" + " = " + resultado);

    }
}
