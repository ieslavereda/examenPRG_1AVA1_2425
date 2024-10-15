import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto;

        System.out.println("Introduce un texto:");
        texto = sc.nextLine();

        System.out.println("En el texto hay " + contarVocales(texto) + " vocales");
    }

    public static int contarVocales(String texto) {

        int pos = 0;
        int cantidad = 0;

        while (pos < texto.length()) {
            if (Ejercicio5.esVocal(texto.charAt(pos)))
                cantidad++;
            pos++;
        }

        return cantidad;
    }
}
