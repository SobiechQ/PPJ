package W13.W13_6;

public class Main {
    public static void main(String[] args) {
        Ludzie[] ludzies = new Ludzie[10];
        ludzies[0]=new Student("1","10");
        ludzies[1]=new Ludzie("2");
        System.out.println(ludzies[0].getData());
        System.out.println(ludzies[1].getData());

        Student student = new Student("3","30");
        System.out.println(student.czyJestCzlowiekiem());
    }
}