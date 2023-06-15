package HomeWork3.base.exceptions;

public class CheckSexException extends RuntimeException{
    public CheckSexException() {
        //super("Sex's value is empty!!!");
        System.out.println("Error code 103: Sex's value is empty!!!");
    }
}
