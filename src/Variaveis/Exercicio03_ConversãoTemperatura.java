//Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F). Utilize a fórmula abaixo:
//
//F = ( 9 C) 5
package Variaveis;
import java.util.Scanner;
public class Exercicio03_ConversãoTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius: ");
        double celsius = entrada.nextDouble();
        double conversor = (9*celsius)/5;
        System.out.println("A temperatura "+celsius+ " celsius, em fahreint é "+conversor);
    }
}
