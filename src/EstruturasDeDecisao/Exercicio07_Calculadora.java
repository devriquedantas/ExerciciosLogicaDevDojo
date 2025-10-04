//Crie uma calculadora que seja capaz de realizar as quatro operações básicas.

package EstruturasDeDecisao;
import java.util.Scanner;
public class Exercicio07_Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        double numero1 = entrada.nextDouble();
        System.out.println("digite o segundo numero");
        double numero2 = entrada.nextDouble();
        System.out.println("digite qual operação matematica");
        String operacao = entrada.next();
        if(operacao.equals("+")){
            System.out.println(numero1+numero2);
        }else if (operacao.equals("-")){
            System.out.println(numero1-numero2);
        }else if (operacao.equals("*")){
            System.out.println(numero1*numero2);
        }else if (operacao.equals("/")){
            System.out.println(numero1/numero2);
        }else {
            System.out.println("operacao invalida");
        }

    }
}
