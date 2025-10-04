//Desenvolva uma calculadora de IMC (Índice de Massa Corporal),
// após realizado o cálculo classificar o paciente de acordo com a tabela abaixo.


package EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio08_Imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite a altura");
        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura);
        if(imc <10){
            System.out.println("Desnutrição Grau V");
        }else if (imc >=10 && imc <=12.9){
            System.out.println("Desnutrição Grau IV");
        }else if (imc >=13 && imc<=15.9){
            System.out.println("Desnutrição Grau III");
        }else if(imc>=16 && imc <=16.9){
            System.out.println("Desnutrição Grau II");
        }else if(imc>=17 && imc<=18.4){
            System.out.println("Desnutrição Grau I");
        }else if(imc>=18.5 && imc<=24.9){
            System.out.println("Normal");
        }else if(imc>=25 && imc<=29.9){
            System.out.println("Pré obesidade");
        }else if(imc>=30 && imc<=34.5){
            System.out.println("Obesidade Grau I");
        }else if(imc>=35 && imc<=39.9){
            System.out.println("Obesidade Grau II");
        }else {
            System.out.println("Obesidade Grau III");
        }

    }
}
