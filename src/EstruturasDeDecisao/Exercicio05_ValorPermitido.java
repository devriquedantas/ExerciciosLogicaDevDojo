//Desenvolva um programa que execute a leitura de um valor numérico inteiro, caso o valor esteja entre 1 e 9 apresentar a mensagem
// “Dentro do valor permitido”e caso contrário apresentar a mensagem  “Fora do Valor Permitido”.
package EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio05_ValorPermitido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = entrada.nextInt();
        if (numero >= 1 && numero <= 9) {
            System.out.println("Dentro do valor");

        } else {
            System.out.println("Fora do valor");
        }


    }
}
