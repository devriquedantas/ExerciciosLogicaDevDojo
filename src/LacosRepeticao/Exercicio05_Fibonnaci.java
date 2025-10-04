//Elaborar um programa que apresente
// a sequência de Fibonacci até o décimo quinto termo.
package LacosRepeticao;

public class Exercicio05_Fibonnaci {
    public static void main(String[] args) {
        int termoanterior = 0;
        int termoranteanterior = 1;
        int proximotermo;
        System.out.println(termoanterior);
        System.out.println(termoranteanterior);

        for (int i = 0; i <=12 ; i++) {
            proximotermo = termoanterior+termoranteanterior;
            System.out.println(proximotermo);
            termoranteanterior=termoanterior;
            termoanterior=proximotermo;
            
        }

    }
}
