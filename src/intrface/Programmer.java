package intrface;

public class Programmer extends Jober implements CanProgramming {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("��� ����������: " + getName() + "(�����������)");
    }

    @Override
    public void doProgramming() {
        System.out.println(getName() + " ����� ���������������");
    }
}
