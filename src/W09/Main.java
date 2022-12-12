public class Main {
    public static void main(String[] args) {
        {
            //Paradygmat programowania oop zasadza się na tworzeniu obiektów które zawierają dane i metody.

            //jak nie ma konstruktora to sie dane new Cookie() bez parametru i tworzy sie sam domyślny pusty konstruktor.
            Cookie obiekt = new Cookie(3);
            //"obiekt" jest zmienną
            obiekt.waga++;
            obiekt.times(2);
            System.out.println(obiekt.waga);
            System.out.println(obiekt.iloscRodzynek);
            //0 bo jest zadeklarowana.

            Cookie obiekt2 = new Cookie(1);
            System.out.println(obiekt2.waga);

            // System.out.println(obiekt.tajeminca); Private
            System.out.println(obiekt.getTajemnica()); //100
        }
        System.out.println("==============");
        {
            Concept obj1= new Concept(1);
            Concept obj2= new Concept(10,10);
            System.out.println("Obj2: "+obj2.dana1+" "+obj2.dana1);
            Concept obj3=obj2.getHalf();
            System.out.println("Obj3: "+obj3.dana1+" "+obj3.dana2);

            //tablica
            Concept[] objArr = new Concept[4];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i]=new Concept(i*10);
            }
            for (Concept conceptI:objArr) {
                System.out.println("\t"+conceptI.dana1);
                if(conceptI.dana1==0){
                    conceptI.dana1=-1;
                }
            }
            System.out.println(objArr[0].dana1);
            System.out.println("\t"+objArr[2].dana1+" "+objArr[2].dana2);
            System.out.println("\t"+objArr[3].dana1+" "+objArr[3].dana2);
            objArr[3]=objArr[2].getHalf();
            System.out.println(" ");
            System.out.println("\t"+objArr[2].dana1+" "+objArr[2].dana2);
            System.out.println("\t"+objArr[3].dana1+" "+objArr[3].dana2);
        }







    }
}