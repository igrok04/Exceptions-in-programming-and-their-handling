package HomeWork3.base.exceptions;

import java.io.IOException;

public class TheSameFileWritingException extends IOException {
    public TheSameFileWritingException(String message) {
        //super("File not found: " + message);
        System.out.println("Error code 114: File not found: " + message);
    }
}
