package W13.W13_6;

public class Student extends Ludzie{
    private String sNumber;
    Student(String name, String sNumber){
        super(name);
        this.sNumber=sNumber;
    }

    @Override
    public String getData() {
        return super.getData()+" jest studentem i ma numer: "+this.sNumber;
    }
    public String czyZdal(){
        return "nie";
    }
}
