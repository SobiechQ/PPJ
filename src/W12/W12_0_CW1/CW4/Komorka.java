package W12.W12_0_CW1.CW4;

public class Komorka extends Telefon {
    String[] ostatnie = new String[10];
    private int index;

    @Override
    public void zadzwon(String numer) throws EmptyNumberExeption,ArrayIndexOutOfBoundsException {
        super.zadzwon(numer);
        add(numer);
    }

    private void add(String s) throws ArrayIndexOutOfBoundsException{
        this.ostatnie[this.index++]=s;
    }
    public void draw() throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i < this.index-1; i++)
            System.out.println(this.ostatnie[this.index]);
    }
}

