package intrface;

public class Cheif extends Jober implements CanCook {
    public Cheif(String name) {
        super(name);
    }

    @Override
    public void doCookPizza() {
        System.out.println(getName() + " начал готовить шарлотку..");
    }

    @Override
    public void voice() {
        System.out.println("Имя сотрудника: " + getName() + "(повар)");
    }
}
