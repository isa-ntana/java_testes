import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        //Escreva um programa que receba um número inteiro n e calcule o fatorial de n usando um loop while.

        int n = sc("Digite um valor: ").nextInt();
        int f = 1;
        int i = 1;

        while (i <= n){
            f = f * i;
            i++;
        }

        System.out.println("O fatorial de !"+n+" é "+f);
    }

    public static Scanner sc (String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}
