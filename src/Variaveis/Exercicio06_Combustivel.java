//Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem.
// Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, desenvolva o cálculo utilizando a fórmula abaixo:
//
//	D=T*V
//	LU=D / 12

package Variaveis;

public class Exercicio06_Combustivel {
    public static void main(String[] args) {
        double tempo = 2;
        double velocidade = 85;
        double distancia = tempo*velocidade;
        double litragem = distancia/12;
        System.out.println(litragem);

    }
}
