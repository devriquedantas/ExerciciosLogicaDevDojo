//Elaborar um programa que realize a conversão de R$ para US$, o programa deve saber qual o valor da cotação do dólar e fazer a conversão.
package Variaveis;
import java.util.Scanner;
public class Exercicio12_ConversaoRealDolar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em R$ ");
        double cotacao = 5.50;
        double real = entrada.nextDouble();
        double conversao = real/cotacao;
        System.out.println("O dolar atualmente está "+cotacao+ ", em reais dá "+conversao);

    }
    }

