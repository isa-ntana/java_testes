import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        //programa precisa ler a palavra e verificar se ela invertida continua sendo igual

        String palin = sc("Digite o palíndromo: ").next();
        var reverse = new StringBuilder(palin).reverse();
        System.out.println("A palavra invertida é: "+reverse);

        if (palin.contentEquals(reverse)) {
            System.out.println("Então "+palin+" é um palíndromo");
        } else {
            System.out.println("Então "+palin+" não é um palíndromo");
        }
    }

    public static Scanner sc(String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}
