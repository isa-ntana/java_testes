import java.util.Scanner;

public class NumPrimos {
    public static void main(String[] args) {
        //Escreva um programa que verifique se um número inteiro é primo.

        int n = sc("Digite um número: ").nextInt();
        boolean primo = true;

        if (n == 0 || n == 1) {
            primo = false; // valores que não contam na regra matemática dos números primos
            System.out.println("Valor inválido!");
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) { //divide o número por i, e vê se o  resto é 0.
                primo = false;
                System.out.println("O valor de "+n+" é primo? R: "+primo);
            } else if (primo) {
                System.out.println("O valor de "+n+" é primo? R: "+primo);
            }
        }
    }

    public static Scanner sc (String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}
