//Elaborar um programa que apresente os quadrados dos números inteiros
// existentes na faixa de valores de 15 até 200.
package LacosRepeticao;

public class Exercicio01_Quadrados {
    public static void main(String[] args) {
        int numero = 15;
        int quadrado = 0;
        while (numero<=200){
            quadrado= numero*numero;
            System.out.println(quadrado);
            numero++;
        }
    }
}
