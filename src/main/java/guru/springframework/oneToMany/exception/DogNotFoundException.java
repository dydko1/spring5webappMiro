package guru.springframework.oneToMany.exception;

public class DogNotFoundException extends RuntimeException {
    public DogNotFoundException(String message) {
        super(message);
    }
}