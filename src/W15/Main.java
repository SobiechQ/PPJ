
package W15;

import java.awt.*;

public class Main
extends Frame {
    public static void main(String[] args) {
//        Figure[] figures = new Figure[4];
//        figures[0]=new Circle(1,2,"kolor1",33);
//        figures[1]=new Figure(5,2,"kolor2");
//        figures[2]=new Figure(5,2,"kolor2");
//        figures[3]=Figure.make(10,27);
//
//        //DLACZEGO TO PROTECTED TU DZIALA AAAAAAAAAAA
//        //NIE POWINNO
//        //CHYBA?
//
//
//        for (Figure f :
//                figures) {
//            System.out.println(f.toString());
//        }
//
//
//        MyList.add(Figure.make(1,10));
//        MyList.add(Figure.make(2,20));
//        MyList.add(Figure.make(3,30));
//        MyList.add(Figure.make(4,40));
//        MyList.add(Figure.make(5,50));
//
//
//        for (int i = 0; i < 14; i++) {
//            System.out.println(MyList.viewElement(i).toString());
//        }

        new Main();

    }
    public Main(){
        this.setSize(400,400);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Figure a  = new Circle(100,100,"d", 30);
        a.draw(g);

    }
}






