package w2;

public class LowFullExeption extends Exception{
    @Override
    public String getMessage() {
        return "Start anulowany, za malo paliwa";
    }
}
