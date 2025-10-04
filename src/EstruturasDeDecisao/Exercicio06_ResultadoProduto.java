//Leia um número inteiro qualquer  e multiplique por 2,
// apresentar o resultado da multiplicação  somente se o resultado for maior ou igual a 30

package EstruturasDeDecisao;
import java.util.Scanner;
public class Exercicio06_ResultadoProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = entrada.nextInt();
        int resultado = numero*2;
        if(resultado >=30){
            System.out.println(resultado);

        }
    }
}
