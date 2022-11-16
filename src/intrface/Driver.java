package intrface;

public class Driver extends Jober implements CanDrive {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void doCarDriving() {
        System.out.println(getName() + " паехал водитель");
    }

    @Override
    public void voice() {
        System.out.println("Имя сотрудника: " + getName() + "(водитель)");
    }
}
