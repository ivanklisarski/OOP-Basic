package Inheritance.OnlineRadioDatabase.exceptions;

public class InvalidSongException extends IllegalArgumentException {
    public InvalidSongException(String message) {
        super(message);
    }
}
