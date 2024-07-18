import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        String bi = sc("Digite seu número binário: ").next();

        int dec= Integer.parseInt(bi,2); //transforma String em int, o 2 é por utilizar apenas 0 e 1
        System.out.println("O número binário "+bi+" convertido para decimal é: "+dec);
    }

    public static Scanner sc(String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}
