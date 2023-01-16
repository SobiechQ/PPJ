package w1;

public class Main {
    public static void main(String[] args) {
        SmokeDetector smokeDetector = new SmokeDetector();
        try {
            smokeDetector.check();
        } catch (Alarm e) {
            System.out.println(e.getMessage());
        }
    }
}
