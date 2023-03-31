package part1.Exception;

public class ExceptionHandling {

    public static void main(String[] args) {

        int i=10;

        try {
            int result = i%0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("please don't");
        }
        finally {
            int result = i%2;
            System.out.println(result);
        }

        System.out.println("finally program runs successfully");

    }

}
