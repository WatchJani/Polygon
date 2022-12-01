public class Main {
    public static void main(String[] args) {

        Point A = new Point(0,0);
        Point C = new Point(2,2);
        Point D = new Point(3, 5);
        Point B = new Point(2,0);
        Point E = new Point(0,2);

        //hiša :D
        Point []mySquare = {A, B, C, D, E};

        //Triangle triangle = new Triangle(A, B, C );

        //System.out.println(triangle.Area());

        Polygon Square = new Polygon(mySquare);

        System.out.println(Square.Area());

    }
}