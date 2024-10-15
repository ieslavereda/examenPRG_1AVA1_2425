import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto;

        System.out.println("Introduce un texto:");
        texto = sc.nextLine();

        System.out.println("El texto es un palíndromo: " + esPalindromo(texto));
    }

    public static boolean esPalindromo(String texto) {
        texto = eliminarEspacios(texto);

        return texto.equalsIgnoreCase(reverse(texto));
    }

    public static String eliminarEspacios(String texto) {
        return texto.replaceAll(" ", "");
    }

    public static String reverse(String texto) {

        String resultado = "";

        for (int i = 0; i < texto.length(); i++)
            resultado = texto.charAt(i) + resultado;

        return resultado;
    }
}
