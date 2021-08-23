import java.util.Arrays;
import java.util.Scanner;

public class Data {

    public static void getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int size = scanner.nextInt();
        Exceptions.array = new int[size];
        System.out.println("Insert array elements:");
        for (int count = 0; count < size; count++) {
            Exceptions.array[count] = scanner.nextInt();
        }
    }

    public static int getNumber(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number from the array by index: " + Arrays.toString(array));
        return array[scanner.nextInt()];
    }
}
