//Escreva um programa que dados cinco valores numéricos inteiros apresente apenas o maior e o menor deles.
package EstruturasDeDecisao;
import java.util.Scanner;
public class Exercicio04_MaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 5 valores inteiros: ");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();
        int n4 = entrada.nextInt();
        int n5 = entrada.nextInt();
        // supondo que o n5 é o maior
        int maior = n5;
        if (n1>maior){
            maior = n1;
        }
        if (n2>maior){
            maior = n2;
        }
        if (n3>maior){
            maior = n3;
        }
        if (n4>maior){
            maior = n4;
        }
        if (n5>maior){
            maior = n5;
        }
        int menor = n5;
        if (n1<menor){
            menor = n1;
        }
        if (n2<menor){
            menor = n2;
        }
        if (n3<menor){
            menor = n3;
        }
        if (n4<menor){
            menor = n4;
        }
        if (n5<menor){
            menor = n5;
        }
        System.out.println(maior);
        System.out.println(menor);

    }
}
