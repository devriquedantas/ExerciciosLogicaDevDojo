//Elaborar um programa que leia o salário base mensal (SB) de um funcionário e o percentual de reajuste (PR)
// e calcule e apresente o novo valor de salário do funcionário. A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:
//NS=SB + (SB*PR)/100


package Variaveis;
import java.util.Scanner;
public class Exercicio13_PercentualReajuste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual salário base?");
        System.out.println("Qual o percentual de reajuste?");
        double pr = entrada.nextDouble();
        double sb = entrada.nextDouble();
        double ns = sb+(sb*pr)/100;
        System.out.println(ns);


    }
}
