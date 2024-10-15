import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la dimensión de la matriz: ");
        int dimension = scanner.nextInt();
        matriz(dimension);
    }

    public static void matriz(int dimension){
        for (int i = 0; i < dimension ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= dimension-i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }

}
