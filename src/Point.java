public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y  = y;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Point) {
            Point point = (Point)obj;
            return point.x == x && point.y == y;
        }
        return false;
    }
}
 