public class Triangle extends Figure {
    private double c;
    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double size) {
        super(size, size);
    }

    @Override
    public double area() {
        double p = (getA() + getB() + c) / 2;
        return p;
    }


}
