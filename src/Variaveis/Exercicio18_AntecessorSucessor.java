//Desenvolva uma rotina que dado um número inteiro qualquer calcule seu antecessor e seu sucessor.
package Variaveis;
import java.util.Scanner;
public class Exercicio18_AntecessorSucessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = entrada.nextInt();
        int antecessor = numero-1;
        int sucessor = numero+1;
        System.out.println("O antecessor de "+numero+ " é: "+antecessor+ " e seu sucessor é: "+sucessor);

    }
}
