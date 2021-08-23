
/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Calculation {

    public static int getDivisionResult(int num1, int num2){
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
            System.out.println("You need to start over!");
            return 0;
        }
    }
}
