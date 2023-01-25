package W13.W13_5;

public class MyList {
    private Element head;






    public void push(int size){
        if(this.head==null){
            this.head=new Element(
                    new Shape(size, Math.random()<0.3?
                    Shape.TRIANGLE:Math.random()<0.5?
                    Shape.SQUARE:
                    Shape.CIRCLE
                    ));
            return;
        }
        Element tmp=this.head;
        while (tmp.getNext()!=null)
            tmp=tmp.getNext();
        tmp.setNext(new Element(
                new Shape(size, Math.random()<0.3?
                        Shape.TRIANGLE:Math.random()<0.5?
                        Shape.SQUARE:
                        Shape.CIRCLE
                )));
    }
    public void pushUp(int size){
        if(this.head==null){
            this.head=new Element(
                    new Shape(size, Math.random()<0.3?
                            Shape.TRIANGLE:Math.random()<0.5?
                            Shape.SQUARE:
                            Shape.CIRCLE
                    ));
            return;
        }
        Element tmp = this.head;
        this.head=new Element(
                new Shape(size, Math.random()<0.3?
                        Shape.TRIANGLE:Math.random()<0.5?
                        Shape.SQUARE:
                        Shape.CIRCLE
                ));
        this.head.setNext(tmp);

    }
    public void popUp(){
        if(this.head==null){
            System.out.println("Lista jest pusta");
            return;
        }
        System.out.println(this.head.getCurrent().getData());
        this.head=this.head.getNext();
    }
    public void pop(){
        if(this.head==null){
            System.out.println("Lista jest pusta");
            return;
        }
        if(this.head.getNext()==null){
            System.out.println(this.head.getCurrent().getData());
            this.head=null;
            return;
        }
        Element tmp = this.head;
        while (tmp.getNext().getNext()!=null){
            tmp=tmp.getNext();
        }
        System.out.println(tmp.getNext().getCurrent().getData());
        tmp.setNext(null);
    }

    public void draw(){
        if(this.head==null){
            System.out.println("Lista jest pusta");
            return;
        }
        Element tmp=this.head;
        do{
            System.out.println(tmp.getCurrent().getData());
            tmp = tmp.getNext();
        }while (tmp!=null);
    }
}
