package HomeWork3.base.exceptions;

public class FullNameReadFromDataException extends IndexOutOfBoundsException{
    public FullNameReadFromDataException(String s) {
        //super("Parse full name exception: " + s);
        System.out.println("Error code 107: Parse full name exception: " + s);
    }
}
