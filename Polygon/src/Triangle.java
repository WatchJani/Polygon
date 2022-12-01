public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public float Area(){
        float AB = this.A.Distance(this.B);
        float BC = this.B.Distance(this.C);
        float CA = this.C.Distance(this.A);

        float s = (AB + BC + CA)/2;

        return (float) Math.sqrt(s*(s-AB)*(s-BC)*(s-CA));
    }

}
