package W11.W11_0_CW2.CW3;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        String[] a = {"PSG","Atleticco Madryt","Sporting CP","Inter","Benfica","Villarreal","RB","Salzburg","Chelsea"};
        String[] b = {"Manchester City","Liverpool", "Ajax","Amsterdam","real Madryt","Bayern Monachium","Manchester United","Lille","Juventus"};
        for (int i = 0; i < a.length; i++) {
            myQueue.put(a[i]);
            if (i<b.length){
                myQueue.put(b[i]);
            }
        }
        while (myQueue.head!=null){
            myQueue.get();
            System.out.print(" vs. ");
            myQueue.get();
            System.out.println(" ");
        }
    }
}
