//Sabendo que 1 ft é igual a 0,3048 m ou 30,48 cm, desenvolva um programa que leia uma medida em pés e calcule o equivalente em metros.

package Variaveis;
import java.util.Scanner;
public class Exercicio17_MedidasPes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a medida em cm: ");
        double medida = entrada.nextDouble();
        double emmetros = medida/100;
        System.out.println(emmetros);

    }
}
