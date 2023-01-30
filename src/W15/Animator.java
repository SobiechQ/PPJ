package W15;

public class Animator extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(33);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
