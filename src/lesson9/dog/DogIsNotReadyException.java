package lesson9.dog;

public class DogIsNotReadyException extends Exception{
    public DogIsNotReadyException(String massage) {
        super(massage);
    }
}
