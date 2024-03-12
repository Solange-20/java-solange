package Array;

import java.util.Random;

public class ArrayFilm {
    public static int[][] llenarArray() {
        int[][] array = new int[6][10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1001); // Genera números aleatorios entre 0 y 1000
            }
        }
        return array;
    }

    // Método para encontrar la posición del máximo y mínimo
    public static int[] encontrarPosiciones(int[][] array) {
        int maxValor = Integer.MIN_VALUE;
        int minValor = Integer.MAX_VALUE;
        int[] maxPosicion = new int[2];
        int[] minPosicion = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValor) {
                    maxValor = array[i][j];
                    maxPosicion[0] = i;
                    maxPosicion[1] = j;
                }
                if (array[i][j] < minValor) {
                    minValor = array[i][j];
                    minPosicion[0] = i;
                    minPosicion[1] = j;
                }
            }
        }
        return new int[][] { maxPosicion, minPosicion };
    }

    // Método para imprimir el array
    public static void imprimirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = llenarArray();
        System.out.println("Array generado:");
        imprimirArray(array);
        int[][] posiciones = encontrarPosiciones(array);
        System.out.println("Posición del máximo: (" + posiciones[0][0] + ", " + posiciones[0][1] + ")");
        System.out.println("Posición del mínimo: (" + posiciones[1][0] + ", " + posiciones[1][1] + ")");
    }
}
