package W13.W13_4;

public class MyStackArray {
    int length=0;

    Student[] students;
    public MyStackArray(int length) {
        this.students = new Student[length];
    }

    public void push(String name, String sNumber){
        if (this.length<this.students.length)
            this.students[this.length++] = new Student(name, sNumber);
        else
            System.out.println("PUSH nie wykonane (Array is full), student: "+name+", "+sNumber+" nie został dodany");
    }
    public void pop(){
        if(this.length-1>=0)
            System.out.println(this.students[--this.length].getData());
        else{
            System.out.println("POP nie wykonane. brak elementu");
        }
    }

}
