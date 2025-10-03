//Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:
// V = VOLUME
//PI = 3.141592654//
// R = RAIO


package Variaveis;
import java.util.Scanner;
public class Exercicio16_VolumeEsfera {
    public static void main(String[] args) {
        System.out.println("Digite o raio: ");
        Scanner entrada = new Scanner(System.in);
        double pi = 3.141592654;
        double r = entrada.nextDouble();
        double volume = (4/3)*pi*(r*r*r);
    System.out.println("o volume é: "+volume);
    }
}
