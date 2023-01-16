package W12.W12_0_CW1.CW1;

public class SmokeDetector {
    public void check() throws Alarm{
        if(Math.random()>0.5)
            throw new Alarm();
    }
}
