import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();

        for (int i = 1; i <= p; i++) {

            int n = scanner.nextInt();
            int[] vendas = new int[n];

            for (int j = 0; j < n; j++) {
                vendas[j] = scanner.nextInt();
            }

            insertionSort(vendas);

            double mediana = calcularMediana(vendas);

            System.out.print("Vendas ordenadas do produto " + i + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(vendas[j]);
                if (j < n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            System.out.printf("Mediana das vendas do produto " + i + ": %.1f\n", mediana);
        }

        scanner.close();
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static double calcularMediana(int[] array) {
        int n = array.length;
        if (n % 2 == 0) {
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            return array[n / 2];
        }
    }
}