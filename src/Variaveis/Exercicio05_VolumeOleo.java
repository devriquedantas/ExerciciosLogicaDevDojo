//Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo, utilize a fórmula abaixo.
//
//V = piR2*A
//
//Onde:
//	V = Volume
//	pi= 3.141592654
//	R = Raio da circunferência da lata
//	A = Altura da lata


package Variaveis;

public class Exercicio05_VolumeOleo {
    public static void main(String[] args) {
        double pi = 3.141592654;
        double altura = 105;
        double raio = 10;
        double volume = pi*(raio*raio)*altura;
        System.out.println(volume);

    }
}
