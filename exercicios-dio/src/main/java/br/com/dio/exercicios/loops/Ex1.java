package br.com.dio.exercicios.loops;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

/*
Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando
a sua idade.(Pare  inserindo o valor 0 no campo nome)
 */
public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int idade = 0;

        for(; ; ){
            System.out.println("Digite o nome: ");
            nome = scanner.next();

            if(nome.equals("0")){
                break;
            }
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();

            System.out.println("Nome: " + nome + " Idade: " + idade);
        }
    }
}