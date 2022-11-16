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
        System.out.println("Имя сотрудника: " + name + "\nДолжность сотрудника: " + job);
        System.out.println("За " + s + " месяца(-ев), полный объём зарплаты равен " + salary * s);
    }
}
