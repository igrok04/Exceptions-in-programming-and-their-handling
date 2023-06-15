package HomeWork3.base.exceptions;

public class ParseDataToIntegerException extends NumberFormatException{
    public ParseDataToIntegerException(String s) {
        //super("Failed to convert string to integer!: " + s);
        System.out.println("Error code 113: Failed to convert string to integer!: " + s);
    }
}
