//Desenvolva um rotina que leia as notas de quatro bimestres de um aluno (N1, N2, N3 e N4), e informe o status do aluno baseado na tabela abaixo:

package EstruturasDeDecisao;
import java.util.Scanner;
public class Exercicio01_Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro bimestre: ");
        double n1 = entrada.nextDouble();
        System.out.println("Digite a nota do segundo bimestre: ");
        double n2 = entrada.nextDouble();
        System.out.println("Digite a nota do terceiro bimestre: ");
        double n3 = entrada.nextDouble();
        System.out.println("Digite a nota do quarto bimestre: ");
        double n4 = entrada.nextDouble();
        double media = (n1+n2+n3+n4)/4;
        System.out.println("A media desse aluno foi: "+media);
        if (media<5){
            System.out.println("Reprovado");
        }else if (media == 5){
            System.out.println("Recuperação");
        }else {
            System.out.println("Aprovado");
        }

    }
}
