package intrface;

public class Jober {
    private String name;

    public Jober(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println("Имя сотрудника: " + name);
    }
}
