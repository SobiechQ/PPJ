package W11.W11_0_CW2.CW6;

public class ClonsoleGraphics {
    private int width;
    private int height;
    private int[] domain;
    private int[] setOfValues;
    private char[][] arr;
    public ClonsoleGraphics(int width, int height) {
        if(width%2==0)
            width++;
        if(height%2==0)
            height++;
        this.width = width;
        this.height = height;
        this.arr=new char[this.height][this.width];
        this.domain = new int[this.width];
        this.setOfValues = new int[this.height];
        int tmpVal=-(this.width/2);
        //Domain
        for (int i = 0; i < this.domain.length; i++) {
            this.domain[i]=tmpVal++;
        }
        //set of values
        tmpVal=this.height/2;
        for (int i = 0; i < this.setOfValues.length; i++) {
            this.setOfValues[i]=tmpVal--;
        }

        clearArr();
    }
    public void clearArr(){
        //Sets all chars as empty_space characters.
        System.out.println(" ");
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                this.arr[i][j]=Main.SPACE_EMPTY;
                if(j==this.width/2)
                    this.arr[i][j]=Main.SPACE_LINE;
                if(i==this.height/2)
                    this.arr[i][j]=Main.SPACE_LINE;
            }
        }

    }
    public double[] generateRandomPoint(){
        //Generates array with 2 numbers indicating random points on the map.
        double[] output = new double[2];
        output[0]=this.domain[(int)(this.domain.length*Math.random())];
        output[1]=this.setOfValues[(int)(this.setOfValues.length*Math.random())];
        return output;
    }
    public double[] calculateEquation(double[] pointA, double[] pointB){
        /*Calculates parameters a and b from linear y=ax+b equation.
        parameter a is output[0] value and b is output[1] value.*/
        double[] output = new double[2];
        output[0]=(pointA[1]-pointB[1])/(pointA[0]-pointB[0]);
        output[1]=((pointA[1]*pointB[0])-(pointB[1]*pointA[0]))/(pointB[0]-pointA[0]);
        return output;
    }
    public void show() {
        //Draws array as it is.
        for (int i = 0; i < this.arr[0].length+3; i++) {
            System.out.print(" ");
        }
        System.out.println("y "+this.setOfValues[0]);



        for (int i = 0; i < this.arr.length; i++) {
            if(i!=this.height/2){
                System.out.print("    ");
            } else {
                 System.out.print(this.domain[0]+" ");
            }
            for (int j = 0; j < this.arr[i].length; j++) {
                System.out.print(this.arr[i][j]+" ");
            }
            if(i==this.arr.length/2){
                System.out.print(this.domain[this.domain.length-1]+ " ->x");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < this.arr[0].length+3; i++) {
            System.out.print(" ");
        }
        System.out.println("y "+this.setOfValues[this.setOfValues.length-1]);
        for (int i = 0; i < (this.arr[0].length)*2+8; i++)
            System.out.print("=");
        System.out.println(" ");

    }


    public void add(double[] pointA){
        //adds a point into arr[][] on given coordinates as a default SPACE_DRAW;
        //Redirects into add(double[], char).
        this.add(pointA,Main.SPACE_DRAW);
    }
    private void add(double[] pointA, char space) {
        /*adds a given char into arr[][] on given coordinates;
        to be used by add(double[], double[]), with 1 and 2 being its space characters.
        If used by add(double[]), space is default MAIN.SPACE_DRAW char.*/
        //todo protect from loop.

        //looking for index numbers of given values;
        try {
            int tmpX=0;
            while (tmpX < this.domain.length && pointA[0] != this.domain[tmpX]) {
                tmpX++;
            }
            int tmpY = 0;
            while (tmpY<this.setOfValues.length && pointA[1] != this.setOfValues[tmpY]) {
                tmpY++;
            }
            if(tmpY!=this.setOfValues.length && tmpX!=this.domain.length) {
                this.arr[tmpY][tmpX] = space;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
    public void add(double[] pointA, double[] pointB){
        //Overrides add(double[]) with add(double[], double[]).
        //Sets 2 points in array and names them accordingly.
        this.add(pointA, 'A');
        this.add(pointB, 'B');
    }

    public void add(double[] pointA, double[] pointB, double[] equation) {
        /* runs add(double[], double[]), and also draws a line equation based on a and b parameters.
        y=ax+b. where a is equation[0] and b is equation[1].
         */
        for (int x:this.domain) {
            int y = (int) Math.round((equation[0]*x)+equation[1]);
            add(new double[]{x,y});
        }
        //runs the overridden add.
        this.add(pointA, pointB);
    }

}
