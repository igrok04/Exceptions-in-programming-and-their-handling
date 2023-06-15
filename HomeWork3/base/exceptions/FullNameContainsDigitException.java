package HomeWork3.base.exceptions;

public class FullNameContainsDigitException extends RuntimeException{
    public FullNameContainsDigitException() {
        //super("One or more symbol in full name's values are digits!!!");
        System.out.println("Error code 105: One or more symbol in full name's values are digits!!!");
    }
}
