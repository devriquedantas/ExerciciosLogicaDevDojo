//Elaborar um programa que calcule e apresente a tabuada de um número qualquer.

package LacosRepeticao;
import java.util.Scanner;
public class Exercicio02_Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int numero = entrada.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero * i);

        }

    }
}
