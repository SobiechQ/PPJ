package W12.W12_0_CW1.CW1;

public class Alarm extends Exception{
    @Override
    public String getMessage() {
        return "Wykryto dym!";
    }
}
