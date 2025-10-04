//Elaborar um programa que calcule o fatorial de um número inteiro
package LacosRepeticao;

import java.util.Scanner;

public class Exercicio06_Fatorial {
    public static void main(String[] args) {
        long fatorial = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero = entrada.nextInt();
        for (int i = 1; i <=numero; i++) {
            fatorial = fatorial*i;
            System.out.println(fatorial);
        }

    }
}
