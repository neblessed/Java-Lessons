package intrface;

public class Programmer extends Jober implements CanProgramming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Имя сотрудника: " + getName() + "(программист)");
    }

    @Override
    public void doProgramming() {
        System.out.println(getName() + " начал программировать");
    }
}
