public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public float Distance(Point x){
        return (float) Math.sqrt((int) Math.pow(x.getX() - this.x, 2) + (int) Math.pow( x.getY() - this.y, 2));
    }

}
