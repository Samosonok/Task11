import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        getArray();
    }

    private static void getArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for(int count = 0; count < size; count++){
            array[count] = scanner.nextInt();
            System.out.println(array[count]);
        }
    }
}
