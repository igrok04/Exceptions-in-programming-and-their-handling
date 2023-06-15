package HomeWork3.base.exceptions;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        //super("One or more values in the full name are empty!!!");
        System.out.println("Error code 106: One or more values in the full name are empty!!!!!!");
    }
}
