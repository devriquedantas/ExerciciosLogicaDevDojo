//Ler valores para as variáveis x e y, trocar os valores das variáveis e apresentar o resultado dos valores invertidos.


package Variaveis;

public class Exercicio07_TrocarValores {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int guardar = x;
        x = y;
        y = guardar;
        System.out.println(x);
        System.out.println(y);
    }
}
