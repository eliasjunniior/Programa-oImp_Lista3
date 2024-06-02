import java.util.Scanner;

import java.util.Locale;

public class Question02 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int s = scanner.nextInt();

        for (int i = 1; i <= s; i++) {

            int n = scanner.nextInt();
            double[] precos = new double[n];

            for (int j = 0; j < n; j++) {
                precos[j] = scanner.nextDouble();
            }
            selectionSort(precos);


            System.out.print("Precos ordenados da secao " + i + ": ");
            for (int j = 0; j < n; j++) {
                System.out.printf("%.2f", precos[j]);
                if (j < n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            System.out.printf("Preco mais barato da secao " + i + ": %.2f\n", precos[0]);
            System.out.printf("Preco mais caro da secao " + i + ": %.2f\n", precos[n - 1]);
        }

        scanner.close();
    }

    public static void selectionSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}