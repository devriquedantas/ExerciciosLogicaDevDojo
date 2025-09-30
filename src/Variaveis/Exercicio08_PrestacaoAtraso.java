package Variaveis;
import java.util.Scanner;
public class Exercicio08_PrestacaoAtraso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual valor da prestação?");
        double valordigitado = entrada.nextDouble();
        System.out.println("Qual a taxa?");
        double taxa = entrada.nextDouble();
        System.out.println("Qual o tempo?");
        double tempo = entrada.nextDouble();
        double equacaoprestacao = valordigitado+(valordigitado *(taxa/100)*tempo);
    System.out.println("o valor da prestação em atraso é: "+equacaoprestacao);

    }
}
