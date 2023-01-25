package W13.W13_4;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getData(){
        return  "Osoba o imieniu: "+this.name+" nie jest studentem.";
    }
    protected String getName(){
        return this.name;
    }
}
