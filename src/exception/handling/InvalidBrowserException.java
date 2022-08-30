package exception.handling;

public class InvalidBrowserException extends Exception{
    InvalidBrowserException(String Message) {
        System.out.println(Message);
    }
}
