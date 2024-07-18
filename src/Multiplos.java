import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        // Escreva um programa que imprima todos os múltiplos de um número n até um limite m.

        int n = sc("Digite um número: ").nextInt();
        int m = sc("Digite um limite de multiplos: ").nextInt();
        int conta = m*n+n; // calculo para multiplicar o valor n pelo multiplo m quantas vezes forem delimitadas no m

        for (int i = 1; i < conta; i++ ){
            if (i % n == 0) {
                System.out.println("O valor "+n+" multiplicado até o limite de "+m+"x daria os resultados "+i);
            }
        }
    }

    public static Scanner sc(String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}
