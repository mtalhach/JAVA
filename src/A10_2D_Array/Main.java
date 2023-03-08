package A10_2D_Array;
public class Main {
    private int x;
    private int y;

    public Main(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return String.format("x:%d   y:%d",x,y);
    }

}
