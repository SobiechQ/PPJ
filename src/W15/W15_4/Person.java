package W15.W15_4;

public class Person {
    int a = 10;
    int b;
    int c = 30;
    static double num;
    static {
        Person.num = Math.random();
    }


    public Person(){
        this.draw();
        def();
        this.b=200;
    }

    public void draw(){
        System.out.println(this.a + ", "+this.b + ", "+this.c + ", ");
    }
    public static void def(){
        System.out.println("defdef");
    }
}
