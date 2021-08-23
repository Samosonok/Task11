import java.util.Arrays;
import java.util.Scanner;

public class Exceptions {

    static int[] array;
    static double index;
    static double num1;
    static double num2;
    static double result;

    public static void main(String[] args) {
        getArray();
        index = getIndex(array);
    }

    public static void getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int size = scanner.nextInt();
        array = new int[size];
        System.out.println("Insert array elements:");
        for (int count = 0; count < size; count++) {
            array[count] = scanner.nextInt();
        }
    }

    public static double getIndex(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number from the array by index: " + Arrays.toString(array));
        return scanner.nextDouble();
    }
}
