package W13.W13_7;

public
    class Main {

    public static void main(String[] args) {
        Person person = new Student( "Jan", 1867, 01);

        person.show();
        //person.fun(); // err

        // ===========================

        Person[] arr ={
            new Student("Ala", 2000, 24000),
            new Person("Edek", 1987),
            person
        };

        for(Person p : arr){
            System.out.println("==========");
            p.show();
        }

        Object[] tab = {
            arr[0], arr[1], arr[2]
        };
        System.out.println("***************");
        for(Object obj : tab){
            System.out.println(
                obj
            );
        }

        // ==================================

        Student s1 = new Student("Ewa", 2000, 25084);
        Student s2 = new Student("Ewa", 2000, 25084);

        System.out.println( s1 == s2);
        System.out.println( s1.equals(s2) );

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
