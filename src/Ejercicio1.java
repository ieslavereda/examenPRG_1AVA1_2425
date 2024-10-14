import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
                break;
            case 2:
            case 4:
                System.out.println("Par");
                break;
            case 3:
                System.out.println("Impar");
            default:
                System.out.println("NaN");
        }

        if (numero >= 0 && numero <= 1) {
            if (numero == 0)
                System.out.println("0");
            System.out.println("1");
        } else if (numero == 2 || numero == 4) {
            System.out.println("Par");
        } else {
            if (numero == 3)
                System.out.println("Impar");
            System.out.println("NaN");
        }
    }
}