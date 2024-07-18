import java.math.MathContext;
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        //potencia
        int n = sc("digite um número: ").nextInt();
        int p = sc("digite uma potência: ").nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result = (int)Math.pow(n, p);
            //já que não existe uma forma de elevar, precisa importar da biblioteca o math, para poder usar o pow
            //pow só funciona com double, então precisa utilizar parenteses antes para converter em int
        }

        System.out.println("O resultado de "+n+" elevado a "+p+" é igual a: "+result);
    }

    public static Scanner sc (String message){
        System.out.print(message);
        return new Scanner(System.in);
    }
}
