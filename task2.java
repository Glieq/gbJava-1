import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите N - размерность массива: ");
        int N = iScanner.nextInt();
        int[] arr[] = new int[N][N];
        N -= 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (N == j) {
                    arr[i][j] = 1;
                    N -= 1;
                    System.out.println(N);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        iScanner.close();
    }
}
