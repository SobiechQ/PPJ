package w1;

public class SmokeDetector {
    public void check() throws Alarm{
        if(Math.random()>0.5)
            throw new Alarm();
    }
}
