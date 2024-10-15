public class Ejercicio3 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble("2") + 1;
        System.out.println(String.valueOf(num1)+2); // la consola debe mostrar 3.02
        int num2 = (int)num1;
        System.out.println(num2); // la consola debe mostrar 3
        System.out.println(String.valueOf(num1)+num2); // la consola debe mostrar 3.03
        float num3 = num2;
        System.out.println(num3); // la consola debe mostrar 3.0
    }
}
