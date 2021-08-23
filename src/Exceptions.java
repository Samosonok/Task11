public class Exceptions {

    static int size;
    static int[] array;
    static int index;
    static int num1;
    static int num2;
    static int result;

    public static void main(String[] args) {
        Data.getSize();
        Data.getArray();
        num1 = Data.getNumber(array);
        num2 = Data.getNumber(array);
        System.out.println("You chose numbers: " + num1 + " and " + num2);
        result = Calculation.getDivisionResult(num1, num2);
        if (num2 != 0) {
            System.out.println("Result of dividing these numbers: " + result);
        }
    }
}