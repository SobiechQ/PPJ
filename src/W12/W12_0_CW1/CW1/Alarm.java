package w1;

public class Alarm extends Exception{
    @Override
    public String getMessage() {
        return "Wykryto dym!";
    }
}
