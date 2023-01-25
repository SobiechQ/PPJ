package W13.W13_4;

public class Main {
    public static void main(String[] args) {
        MyStackList msl = new MyStackList();
        msl.push("1");
        msl.push("2");
        msl.push("3","30");
        msl.push("4","40");


        msl.pop();
        msl.pop();
        msl.push("5","50");
        msl.push("6","60");
        msl.push("7","70");
        msl.pop();
        msl.pop();
        msl.pop();
        msl.pop();
        msl.pop();
        msl.pop();
        msl.push("8","80");
        msl.push("9");
        msl.show();
    }
}
