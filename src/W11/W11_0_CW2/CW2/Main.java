package W11.W11_0_CW2.CW2;

public class Main {
    public static void main(String[] args) {
        {
            MyStackArray myStorage = new MyStackArray(5);
            myStorage.pop();
            myStorage.push("1", 1);
            myStorage.push("2", 2);
            myStorage.push("3", 3);
            myStorage.pop();
            myStorage.push("4", 4);
            myStorage.push("5", 5);
            myStorage.push("6", 6); //na indexie 4
            myStorage.push("7", 7);
            myStorage.push("8", 8);
            myStorage.pop();
            myStorage.push("9", 9);
            myStorage.pop();
            myStorage.pop();
            myStorage.pop();
            myStorage.pop();
            myStorage.pop();
            myStorage.pop();
            myStorage.pop();
            System.out.println(" ");
            System.out.println("=======================================");
            System.out.println(" ");
        }
        {
            MyStackList myStackList = new MyStackList(5);
            myStackList.pop();
            myStackList.push("1",1);
            myStackList.push("2",2);
            myStackList.push("3",3);
            myStackList.pop();
            myStackList.pop();
            myStackList.pop();
            myStackList.pop();
            myStackList.push("4",4);
            myStackList.push("5",5);
            myStackList.push("6",6);
            myStackList.push("7",7);
            myStackList.push("8",8);
            myStackList.push("9",9); //to sie nie dodaje bo granica stosu
            myStackList.push("10",10); //to też nie
            myStackList.pop();
            myStackList.pop();
            myStackList.push("11",11);
            myStackList.push("12",12);
            myStackList.pop();
            myStackList.pop();
            myStackList.pop();
        }

    }
}
