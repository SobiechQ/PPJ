package W12.W12_3;

public class Player {
    char body;
    int facing=0;
    int x=0;
    int y=0;
    Player(int x, int y){
        for (int i = 0; i < Math.random()*4; i++) {
            this.facing++;
        }
        this.addPos();
        this.x=x;
        this.y=y;
    }
    public void addPos(){
        this.facing++;
        switch (this.facing%4){
            case 0->this.body='\u2191'; //↑
            case 1->this.body='\u2192'; //→
            case 2->this.body='\u2193'; //↓
            case 3->this.body='\u2190'; //←
        }
    }
    public void updatePos(int x, int y){
        this.x=x;
        this.y=y;
    }
    public char getBody() {
        return body;
    }
}
