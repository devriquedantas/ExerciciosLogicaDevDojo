//Desenvolva a leitura de cinco valores numéricos inteiros e apresente somente os que forem divisíveis por 2 ou por 3.
package EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio03_Divisiveis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 5 numeros separados por espaço: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        int n5 = entrada.nextInt();
        if (n1 % 2 == 0 || n1 % 3 == 0) {
            System.out.println(n1);
        }
        if (n2 % 3 == 0 || n2 % 2 == 0) {
            System.out.println(n2);
        }
        if (n3 % 2 == 0 || n3 % 3 == 0) {
            System.out.println(n3);
        }
        if (n4 % 2 == 0 || n4 % 3 == 0) {
            System.out.println(n4);
        }
        if (n5 % 2 == 0 || n5 % 3 == 0){
            System.out.println(n5);
        }

    }
}
