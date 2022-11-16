public class BoxWidth extends Box {
    double width;

    public BoxWidth(double height, double weight, double width) {
        super(height, weight);
        this.width = width;
    }

    public BoxWidth(Box box1, Box box2) {
        super(box1, box2);
    }

    @Override
    public double volume() {
        return height * weight * width;
    }

    @Override
    public void showInfo(){
        System.out.println("Высота: "+ height);
        System.out.println("Ширина: "+ width);
        System.out.println("Вес: "+ weight);
    }
}
