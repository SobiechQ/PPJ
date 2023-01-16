package W12.W12_0_CW1.CW3;

public class EmptyNumberExeption extends Exception{
    @Override
    public String getMessage() {
        return "Nie podano numeru telefonu.";
    }
}
