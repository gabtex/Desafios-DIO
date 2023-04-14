package br.com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que leia 20 números aleatórios entre (0 e 100) armazene-os em um vetor.
Ao final mostre os números e seus sucessores
 */
public class Ex3 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] vetor = new int[20];
        int i = 0;

        for(i = 0; i < vetor.length; i++){
            int numero = random.nextInt(100);
            vetor[i] = numero;
        }

        for(int numero : vetor){
            System.out.println("Números aleatórios: " + numero + " " + "Números sucessores: " + (numero+1));

        }
    }
}
