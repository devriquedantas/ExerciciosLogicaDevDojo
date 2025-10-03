//Construa um programa que calcule a velocidade em metros por segundo de um projétil
// que percorre uma distância em quilômetros a um espaço de tempo em minutos, utilize a fórmula abaixo:
//V=(D*1000)/(T*60)

package Variaveis;
import java.util.Scanner;
public class Exercicio15_VelocidadeProjetil {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual foi a distancia em km?");
        double distancia = entrada.nextDouble();
        System.out.println("Em quantos minutos?");
        double minutos = entrada.nextDouble();
        double velocidade = (distancia*1000)/(minutos*60);
        System.out.println("A velocidade em metros por segundo foi de "+velocidade);

    }
}
