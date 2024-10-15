public class Ejercicio5 {

    public static boolean esVocal(char letra) {
        letra = String.valueOf(letra).toUpperCase().charAt(0);
        switch (letra) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

}
