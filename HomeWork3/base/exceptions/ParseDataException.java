package HomeWork3.base.exceptions;

public class ParseDataException extends RuntimeException{
    public ParseDataException(String message) {
        //super("Exception in the loop, during parsing: " + message);
        System.out.println("Error code 112: Exception in the loop, during parsing: " + message);
    }
}
