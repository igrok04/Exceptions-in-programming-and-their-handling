package HomeWork3.base.exceptions;

public class MyFileCreateException extends FileCreateException{
    public MyFileCreateException(String message) {
        super("");
        //super("Can't create file in CFileCreator: " + message);
        System.out.println("Error code 111: Can't create file in CFileCreator:  " + message);
    }
}
