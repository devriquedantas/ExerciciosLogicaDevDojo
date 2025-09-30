package Variaveis;

import java.util.Scanner;

public class Exercicio01_AreaCirculo {
    public static void main(String[] args) {
        //Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.
        //
        //A = PIR2
        //
        //Onde:
        // 	A representa a área do círculo
        //  	PI = 3.141592654
        //	R = Raio do círculo (deve ser fornecido pelo usuário)
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o raio do círculo?");
        int raio = entrada.nextInt();
        double pi = 3.141592654;
        double calculoarea = pi*(raio*raio);
        System.out.println("a área do círculo é "+calculoarea);
    }
}
