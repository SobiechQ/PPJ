package W11.W11_0_CW2.CW2;

public class MyStackArray {
    int curentIndex =0;
    Student[] students;
    public MyStackArray(int maxSize) {
        this.students = new Student[maxSize];
    }
    public void push(String name, int sNumber){
        if(this.students[this.curentIndex]==null) {
            this.students[this.curentIndex] = new Student(name, sNumber);
            if(this.curentIndex+1<this.students.length)
                this.curentIndex++;
        } else {
            System.out.println("Stos jest pełen, nie dodano studenta: "+name+", z eską: "+sNumber);

        }
    }
    public void pop(){
        if(this.curentIndex>0&&this.students[curentIndex-1]!=null){
            //dla pełnego stosu nie odejmuj
            if(this.students[this.curentIndex]==null)
                this.curentIndex--;
            System.out.print("Dla indexu: "+this.curentIndex+"         ");
            this.students[curentIndex].show();
            this.students[curentIndex]=null;

        } else {
            System.out.println("Stos jest pusty.");
        }
    }
}
