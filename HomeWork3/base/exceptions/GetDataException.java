package HomeWork3.base.exceptions;

import java.io.IOException;

public class GetDataException extends IOException {
    public GetDataException(IOException message) {
        //super("Exception while reading from console: " + message.getMessage());
        System.out.println("Error code 109: Exception while reading from console: " + message.getMessage());
    }
}
