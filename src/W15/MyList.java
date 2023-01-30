package W15;

public class MyList {
    private static MyList head;
    private static MyList tail;

    public MyList(Figure figure) {
        this.data = figure;
        this.next = null;
    }

    public static void add(Figure figure){
        if(MyList.head==null){
            MyList.head = MyList.tail = new MyList(figure);
            return;
        }
        MyList.tail.next = new MyList(figure);
    }
    public static Figure viewElement(int index){
        MyList tmp = MyList.head;
        int count = 0;
        while (tmp.next != null && count++ < index){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    private Figure data;
    private MyList next;

}
