import java.util.Arrays;
import java.util.Scanner;

public class Data {

    public static int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        try {
            Exceptions.size = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException size) {
            System.out.println("NumberFormatException");
            return getSize();
        }
        return Exceptions.size;
    }

    public static int[] getArray() {
        Exceptions.array = new int[Exceptions.size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert array elements:");
        for (int count = 0; count < Exceptions.size; count++) {
            try {
                Exceptions.array[count] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException array) {
                System.out.println("NumberFormatException");
                return getArray();
            }
        }
        return Exceptions.array;
    }

    public static int getNumber(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number from the array by index: "
                + Arrays.toString(array));
        try {
            Exceptions.index = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException size) {
            System.out.println("NumberFormatException");
            return getNumber(array);
        }
        return Exceptions.array[Exceptions.index];
    }
}