package w4;

public class EmptyNumberExeption extends Exception{
    @Override
    public String getMessage() {
        return "Nie podano numeru telefonu.";
    }
}