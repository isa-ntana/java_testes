import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) {
        String inv = sc("Digite algo: ").next();
        var reverse = new StringBuilder(inv).reverse(); //variavel criada para chamar o reverse
        System.out.println(reverse); //print do reverso
    }


    public static Scanner sc (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
