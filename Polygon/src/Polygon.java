public class Polygon {
    Point []points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    public float Area(){
        float area = 0;

        for (int i = 1; i < points.length-1; i++){
            area += new Triangle(points[0], points[i],points[i+1]).Area();
        }

        return area;
    }

}
