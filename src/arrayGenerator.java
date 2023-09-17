import java.util.Random;
import java.util.Arrays;

public class arrayGenerator {
    /**
     * @param size Número de elementos do vetor a ser criado.
     * @return Um novo vetor de inteiros de tamanho 'size' contendo valores aleatórios entre 0 e 100.
     */
    public static Integer[] generateArray(int size) {
        Integer[] array = new Integer[size];
        Random r = new Random();
        int key;

        for (int i = 0; i < array.length; i++) {
            key = r.nextInt(101);
            array[i] = key;
        }

        return array;
    }

    public static Integer[] generateSortedArray(int size) {
        Integer[] array = new Integer[size];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(101);
        }

        Arrays.sort(array);

        return array;
    }

}
