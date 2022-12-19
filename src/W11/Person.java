package W11;

public class Person
//    extends Object
    //redundantne, każda klasa dziecdziczy po Object.
    {
        int jestWObu=10;
    protected String name;
    protected int birthYear;
        //todo co do cholery robi protected.

        //klasa ogólna (klasa bazowa)

        public void drawName(){
            System.out.println(this.name);
        }
        public void draw(){
            System.out.println("Imie: "+this.name+", "+" Rok: "+this.birthYear);
        }
    }
