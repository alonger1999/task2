public class Point {

    private double x, y;

    public Point(double x, double y) {

        this.x = x;
        this.y = y;

    }

    public double getDistance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    @Override
    public String toString() {
        return "Point: " + "(" + this.x + ", " + this.y + ")";
    }

}
