package W13.W13_5;

public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.push(1);
        ml.push(2);
        ml.push(3);
        ml.push(4);
        ml.push(5);
        ml.push(6);
        ml.pushUp(7);
        ml.pushUp(8);
        ml.draw();
        ml.pop();
        ml.popUp();
        System.out.println("==================");
        ml.draw();
        ml.pop();
        ml.pop();
        ml.pop();
        ml.pop();
        ml.pop();
        ml.pop();
        ml.pop();
        ml.pop();
        ml.pop();
        ml.pushUp(9);
        ml.pushUp(10);
        ml.draw();
    }
}
