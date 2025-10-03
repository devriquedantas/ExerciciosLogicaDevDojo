// Desenvolva uma rotina que dados três números inteiros, apresente-os em ordem crescente

package EstruturasDeDecisao;

import java.util.Scanner;

public class Exercicio02_OrdemCrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = entrada.nextInt();
        System.out.println("Digite o terceiro número");
        int n3 = entrada.nextInt();
        if (n1 < n2 && n1 < n3) {
            if (n2 > n3) {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            } else {
                System.out.println(n1 + ", " + n2 + ", " + n3);
            }}
            if (n2 < n1 && n2 < n3){
                if(n1<n3){
                    System.out.println(n2 + ", " + n1 + ", " + n3);
                } else {
                    System.out.println(n2 + ", " + n3 + ", " + n1);
                }}
                if (n3<n1 && n3<n2){
                    if(n1<n2){
                        System.out.println(n3 + ", " + n1 + ", " + n2);
                    }else {
                        System.out.println(n3 + ", " + n2 + ", " + n1);
                    }
                }
            }
        }


