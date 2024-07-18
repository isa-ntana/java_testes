import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int f = sc("Digite até qual termo irá: ").nextInt();
        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= f; i++){
            if (f > 1){
                // calculo para somar na sequencia de fibonacci
                n1 = n1 + n2;
                n2 = n1 - n2;
                System.out.println("Sequencia de Fibonacci é "+n1);
            } else {
                System.out.println("Valor muito baixo!");
            }
        }
    }

    public static Scanner sc(String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}
