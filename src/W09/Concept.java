package W09;

public class Concept {
    int dana1;
    int dana2;
    Concept(int i1){
        this.dana1=i1;
    }
    Concept(int i1, int i2){
        this.dana1=i1;
        this.dana2=i2;
//        System.out.println("Użyto drugiego");
    }
    //zwraca obiekt.
    public Concept getHalf(){
        return new Concept(this.dana1/2);
    }

}
