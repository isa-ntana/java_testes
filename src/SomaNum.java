import java.util.Scanner;

public class SomaNum {

    public static void main(String[] args) { //metodo escrever o codigo
        // escreva um programa que receba um número inteiro n e calcule a soma dos números de 1 a n usando um loop for

        int n = sc("Digite um valor:").nextInt();

        int soma = 0;
        for(int i = 1; i <= n; i++){
            soma += i;
        }
        System.out.println("O total será: "+soma);
    }

    //metodo
    public static Scanner sc (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}


//função
