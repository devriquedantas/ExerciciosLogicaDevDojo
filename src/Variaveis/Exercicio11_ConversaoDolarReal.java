//Elaborar um programa que realize a conversão de US$ para R$, o programa deve saber qual o valor da cotação do dólar e fazer a conversão.


package Variaveis;
import java.util.Scanner;
public class Exercicio11_ConversaoDolarReal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em US$ ");
        double cotacao = 5.50;
        double dolar = entrada.nextDouble();
        double conversao = dolar*cotacao;
        System.out.println("O dolar atualmente está "+cotacao+ ", em reais dá "+conversao);

    }
}
