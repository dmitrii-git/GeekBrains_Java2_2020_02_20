package lesson2;

public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("Деление на ноль!");
    }
}
