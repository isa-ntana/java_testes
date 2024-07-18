import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        // Escreva um programa que receba um número inteiro e conte quantos dígitos ele possui.

        String n = sc("Digite um número: ").next();
        System.out.println("O número possui "+n.length()+" digitos!");
    }

    public static Scanner sc (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
