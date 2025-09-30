package Variaveis;
//Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário.
// Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.
//
//SB = HT * VH
//TD = (PD / 100) * SB
//SL = SB  - TD
//SB =  Salário Base
//HT = Horas Trabalhadas
//VH = Valor Hora de trabalho
//TD = Total de Descontos
// PD = Percentual de Desconto
//SL = Salário Líquido//
import java.util.Scanner;
public class Exercicio02_CalculoSalarioLiquido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário base");
        double salariobase = entrada.nextDouble();
        System.out.println("Digite o total de desconto");
        double desconto = entrada.nextDouble();
        double salarioliquido = salariobase-desconto;
        System.out.println("Seu salario líquido é "+salarioliquido);

    }
}
