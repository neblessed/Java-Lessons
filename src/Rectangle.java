public class Rectangle {
    double lenght;
    double height;

    void setParams(double lenght, double height) {
        this.height = height;
        this.lenght = lenght;
    }

    double checkPerimeter() {
        return height + lenght;
    }

    double checkValue() {
        return height * lenght;
    }

    static int upStepen(int a) {
        return a * a;
    }
}
