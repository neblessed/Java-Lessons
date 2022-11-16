public class Box {
    public double height;
    public double weight;

    public Box(double height, double weight) {
        this.weight = weight;
        this.height = height;
    }

    public double volume() {
        return height * weight;
    }

    public int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();

        if (thisVolume > boxVolume) {
            return 1;
        } else if (thisVolume < boxVolume) {
            return -1;
        } else return 0;
    }

    public Box(Box box, int i) {
        this.weight = box.weight * i;
        this.height = box.height * i;
    }

    public Box(Box box1, Box box2) {
        this.height = box1.height * 2 + box2.height * 2;
        this.weight = box1.weight * 2 + box2.weight * 2;

    }

    public void showInfo (){
        System.out.println("Высота: "+ height);
        System.out.println("Вес: "+ weight);
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        if (height != 0) {
            this.height = height;
        } else System.out.println("Значение не может быть 0");
    }

    public void setWeight(double weight) {
        if (weight != 0) {
            this.weight = weight;
        } else System.out.println("Значение не может быть 0");
    }
}
