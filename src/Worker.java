public class Worker {
    String name;
    String job;
    int salary;

    public Worker(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    void checkSalaryForPeriod(int s) {
        System.out.println("��� ����������: " + name + "\n��������� ����������: " + job);
        System.out.println("�� " + s + " ������(-��), ������ ����� �������� ����� " + salary * s);
    }
}
