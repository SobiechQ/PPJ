package W10.W10_2;

public class Storage {
    Student[] students = new Student[100];
    int studentsIndex=0;

    public String getImie() {
        return students[0].nazwa;
    }

    public void makeStud(){
        this.students[this.studentsIndex++]=new Student("Kiryl", 2137);
    }
    public void draw(){
        for (int i = 0; i < studentsIndex; i++) {
            System.out.println(this.students[i].nazwa+", "+this.students[i].eska);
        }
    }


}
