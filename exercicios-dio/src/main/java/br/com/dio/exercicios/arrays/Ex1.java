package br.com.dio.exercicios.arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa
 */
public class Ex1 {
    public static void main(String[] args) {

        int[] vetor = {0, -5, 15, 50, 8, 4};

        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
