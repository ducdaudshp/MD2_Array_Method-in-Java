import java.util.Scanner;

public class daonguoc {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước mảng");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không vượt quá 20");
        } while (size > 20);
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Mảng phần từ: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.printf("\n%-20s%s", "Mảng sau khi đảo ngược là: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
