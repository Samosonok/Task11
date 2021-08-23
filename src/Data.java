import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Data {

    public static int getSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        try {
            Exceptions.size = Integer.parseInt(scanner.nextLine());
            return Exceptions.size;
        } catch (NumberFormatException e) {
            System.out.println("You entered not a number!");
            return getSize();
        }
    }

    public static int[] getArray() {
        Exceptions.array = new int[Exceptions.size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int count = 0; count < Exceptions.size; count++) {
            try {
                Exceptions.array[count] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You entered not a number!");
                return getArray();
            }
        }
        return Exceptions.array;
    }

    public static int getNumber(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number from the array by index " +
                "(1st number - index 0, 2nd - index 1...)\n"
                + Arrays.toString(array));
        try {
            Exceptions.index = Integer.parseInt(scanner.nextLine());
            return Exceptions.array[Exceptions.index];
        } catch (NumberFormatException e) {
            System.out.println("You entered not a number!");
            return getNumber(array);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex Out Of Bounds!");
            return getNumber(array);
        }
    }
}