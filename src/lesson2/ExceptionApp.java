package lesson2;

public class ExceptionApp {
    public static void main(String[] args) {
        try {
            justMethod();
            int[] c = {1, 2, 3};
//            System.out.println(c[555]);
//        } catch (ArithmeticException e) {
//            System.out.println("Была ошибка деления на ноль!");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Невалидный индекс для массива!");
//        } catch (Exception e) {
//            System.out.println("Что-то новенькое!");
//        }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка!");
        }
        System.out.println("Finish");
    }

    private static void justMethod() {
        try {
            int a = 1;
            int b = divide(a);
            System.out.println("Это сообщение не будет выведено в консоль");
            return;
        } catch (ArithmeticException e) {
            System.out.println("Была ошибка деления на ноль!");
            throw e;
        } finally {
            System.out.println("Finally block");
        }
    }

    private static int divide(int a) throws DivideByZeroException {
        if (a == 0) {
            throw new DivideByZeroException();
        }
        return 10 / a;
    }
}
