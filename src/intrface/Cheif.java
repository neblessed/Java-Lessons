package intrface;

public class Cheif extends Jober implements CanCook {
    public Cheif(String name) {
        super(name);
    }

    @Override
    public void doCookPizza() {
        System.out.println(getName() + " ����� �������� ��������..");
    }

    @Override
    public void voice() {
        System.out.println("��� ����������: " + getName() + "(�����)");
    }
}
