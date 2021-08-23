public class Exceptions {

    static int[] array;
    static int num1;
    static int num2;
    static double result;

    public static void main(String[] args) {
        Data.getArray();
        num1 = Data.getNumber(array);
        num2 = Data.getNumber(array);
    }
}
