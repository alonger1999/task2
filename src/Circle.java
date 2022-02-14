public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {

        this.center = center;
        this.radius = radius;

    }

    public PointList inbounding(PointList list) {

        PointList result = new PointList();

        Point[] points = list.toArray();

        for (int i = 0; i < points.length; i++) {
            if (inbounds(points[i])) {
                result.add(points[i]);
            }
        }

        return result;

    }

    private boolean inbounds(Point point) {
        return this.center.getDistance(point) < this.radius;
    }

}
