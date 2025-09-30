//Escreva um programa que realize a conversão de graus Fahrenheit (F)  para graus Celsius (C). Utilize a fórmula abaixo:
//
//C = (( F - 32)  5)9

package Variaveis;
import java.util.Scanner;
public class Exercicio04_ConversaoFahrenheitParaCelsius  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        double conversao = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println(fahrenheit+ " em celsius é " +conversao);

    }
}
