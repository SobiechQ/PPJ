package W12.W12_0_CW1.CW2;

public class LowFullExeption extends Exception{
    @Override
    public String getMessage() {
        return "Start anulowany, za malo paliwa";
    }
}
