package Variaveis;
//Desenvolva uma rotina que leia dois valores numéricos inteiros
// e apresente o resultado das quatro operações aritméticas básicas (adicao, subtracao, multiplicacao e divisao).
import java.util.Scanner;
public class Exercicio14_TodasOperaçoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números inteiros: ");
        int v1 = entrada.nextInt();
        int v2 = entrada.nextInt();
        int soma = v1+v2;
        System.out.println("A soma deu "+soma+ "!");
        int produto = v1*v2;
        System.out.println("A multiplicação deu "+produto+ "!");
        float divisao = v1/v2;
        System.out.println("A divisão deu "+divisao+ "!");

    }
}
