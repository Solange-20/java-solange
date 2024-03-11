package Nuevacarpeta;

public class ejercicio06 {
    public static void main(String[] args) {
        // Declaración de variables char
        char char1 = 'H';
        char char2 = 'o';
        char char3 = 'l';
        char char4 = 'a';
        char char5 = '!';

        // Conversión de chars a String
        String cadena = Character.toString(char1) + Character.toString(char2) +
                Character.toString(char3) + Character.toString(char4) +
                Character.toString(char5);

        // Mostrar la cadena por pantalla
        System.out.println(cadena);
    }
}
