//Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado,
// ao cubo e a 10, apresentar também a soma total dos três resultados anteriores.

package Variaveis;
import java.util.Scanner;
public class Exercicio10_NumeroElevado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = entrada.nextInt();
        int numeroquadrado = numero*numero;
        System.out.println("o número que você digitou ao quadrado é: "+numeroquadrado);
        int numerocubo = numero*numero*numero;
        System.out.println("o número que você digitou ao cubo é: "+numerocubo);
        double numeroelevado = Math.pow(numero, 10);
        System.out.println("o número que você digitou elevado a 10 é: "+numeroelevado);
        double soma = numerocubo+numeroelevado+numeroquadrado;
        System.out.println("A soma é: "+soma);
    }
}
