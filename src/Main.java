import java.util.Scanner;
import thealgorithms.sorts.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Ordenação com Bubblesort
                1 - Vetor n = 62500
                2 - Vetor n = 125000
                3 - Vetor n = 250000
                4 - Vetor n = 375000
                
                Ordenação com Mergesort
                5 - Vetor n = 62500
                6 - Vetor n = 125000
                7 - Vetor n = 250000
                8 - Vetor n = 375000
                
                Ordenação com Quicksort
                9 - Vetor aleatório n = 100000
                10 - Vetor ordenado n = 100000
                """);

        System.out.printf("Opção: ");
        int op = Integer.parseInt(scan.nextLine());

        switch (op) {
            case 1:
                bubblesort(65200);
                break;
            case 2:
                bubblesort(125000);
                break;
            case 3:
                bubblesort(250000);
                break;
            case 4:
                bubblesort(375000);
                break;
            case 5:
                mergesort(65200);
                break;
            case 6:
                mergesort(125000);
                break;
            case 7:
                mergesort(250000);
                break;
            case 8:
                mergesort(375000);
                break;
            case 9:
                quicksort(10000);
                break;
            case 10:
                quicksortSorted(10000);
                break;
        }
    }

    /**
     * Imprime na tela todos os elementos de 'array'.
     * @param array Vetor de inteiros a ser impresso;
     */
    static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
    }

    /**
     * Ordena 50 vetores aleatoriamente criados a partir do método generateArray(size). Para cada vetor
     * ordenado, imprime na tela o tempo de execução da ordenação. Ao final das 50 iterações, calcula e
     * exibe o tempo médio de todas as ordenações realizadas a partir do método Bubblesort.
     * @param arraySize Tamanho dos vetores a serem ordenados.
     */
    static void bubblesort(int arraySize) {
        long totalTime = 0;

        for (int i = 1; i < 51; i++) {
            long startTime = System.nanoTime();

            Integer[] array = arrayGenerator.generateArray(arraySize);
            SortAlgorithm sort = new BubbleSort();

            sort.sort(array);
//            printArray(array);

            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Array " + i + " - Tempo de execução: " + elapsedTime + " nanossegundos");
            totalTime += elapsedTime;
        }

        long averageTime = totalTime/50;
        System.out.println("Tempo médio de execução de 50 arrays: " + averageTime);
    }

    /**
     * Ordena 50 vetores aleatoriamente criados a partir do método generateArray(size). Para cada vetor
     * ordenado, imprime na tela o tempo de execução da ordenação. Ao final das 50 iterações, calcula e
     * exibe o tempo médio de todas as ordenações realizadas a partir do método Mergesort.
     * @param arraySize Tamanho dos vetores a serem ordenados.
     */
    static void mergesort(int arraySize) {
        long totalTime = 0;

        for (int i = 1; i < 51; i++) {
            long startTime = System.nanoTime();

            Integer[] array = arrayGenerator.generateArray(arraySize);
            SortAlgorithm sort = new MergeSort();

            sort.sort(array);
//            printArray(array);

            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Array " + i + " - Tempo de execução: " + elapsedTime);
            totalTime += elapsedTime;
        }

        long averageTime = totalTime/50;
        System.out.println("Tempo médio de execução de 50 arrays: " + averageTime);
    }

    /**
     * Ordena 10 vetores aleatoriamente criados a partir do método generateArray(size). Para cada vetor
     * ordenado, imprime na tela o tempo de execução da ordenação. Ao final das 10 iterações, calcula e
     * exibe o tempo médio de todas as ordenações realizadas a partir do método Quicksort.
     * @param arraySize Tamanho dos vetores a serem ordenados.
     */
    static void quicksort(int arraySize) {
        long totalTime = 0;

        for (int i = 1; i < 11; i++) {
            long startTime = System.nanoTime();

            Integer[] array = arrayGenerator.generateArray(arraySize);
            SortAlgorithm sort = new QuickSort();

            sort.sort(array);
//            printArray(array);

            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Array " + i + " - Tempo de execução: " + elapsedTime);
            totalTime += elapsedTime;
        }

        long averageTime = totalTime/10;
        System.out.println("Tempo médio de execução de 10 arrays: " + averageTime);
    }

    /**
     * Ordena 10 vetores ordenados  criados a partir do método generateArray(size). Para cada vetor
     * ordenado, imprime na tela o tempo de execução da ordenação. Ao final das 10 iterações, calcula e
     * exibe o tempo médio de todas as ordenações realizadas a partir do método Quicksort.
     * @param arraySize Tamanho dos vetores a serem ordenados.
     */
    static void quicksortSorted(int arraySize) {
        long totalTime = 0;

        for (int i = 1; i < 11; i++) {
            long startTime = System.nanoTime();

            Integer[] array = arrayGenerator.generateSortedArray(arraySize);
            SortAlgorithm sort = new QuickSort();

            sort.sort(array);
//            printArray(array);

            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Array " + i + " - Tempo de execução: " + elapsedTime);
            totalTime += elapsedTime;
        }

        long averageTime = totalTime/10;
        System.out.println("Tempo médio de execução de 10 arrays: " + averageTime);
    }

}
