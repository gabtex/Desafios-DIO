package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

tabuada do 5:
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
...
5 X 10 = 50
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a tabuada que deseja ver: ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuada do " + tabuada);
        for (int i = 1; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }
    }
}
