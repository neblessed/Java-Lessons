import java.util.ArrayList;

import intrface.*;
import intrface.Jober;

public class Main {
    public static void main(String[] args) {
        Liner line = new Liner();
        System.out.println("~~~~~~~~~~~~ JAVA ROAD TO JUNIOR. Tokaev V.A. ~~~~~~~~~~~~~~~~");
        line.addLine("Урок 3. Параметризированные методы (Rectangle)");

        Rectangle rectangle = new Rectangle();
        rectangle.setParams(10, 10);
        System.out.println(rectangle.checkPerimeter());
        System.out.println(rectangle.checkValue());


        line.addLine("Урок 4. Параметризированные методы (Worker)");
        Worker worker = new Worker("Вадим", "QA", 25000);
        worker.checkSalaryForPeriod(6);

        line.addLine("Урок 5. Перегрузка методов/конструкторов. Ключевое слово static");
        int b = Rectangle.upStepen(19); //static-метод, не обязательно создавать объект класса. Можно обращаться (Класс.Метод)
        System.out.println("! Возведение в степерь, static-метод: " + b);
        Monster zuli = new Monster(1, 4, 2);
        Monster rick = new Monster();
        Monster fops = new Monster(6);
        System.out.println("Просто подать голос: ");
        zuli.voice();
        System.out.println("Подать голос определённое кол-во раз: ");
        rick.voice(3);
        System.out.println("Крикнуть по-особенному, определённое кол-во раз: ");
        fops.voice(2, "Rrraw");

        line.addLine("Урок 6. Объекты в качестве параметров и возврат объектов");
        Box box = new Box(10, 10);
        Box box2 = new Box(box, 10);
        double f = box.volume();
        double g = box2.volume();
        System.out.println("Площадь первой коробки: " + f);
        System.out.println("Площадь второй коробки: " + g);
        int result = box.compare(box2);
        switch (result) {
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
            case 0:
                System.out.println("Наши коробки равны");
                break;
        }
        Box boxNew = new Box(box, box2);
        double funal = boxNew.volume();
        System.out.println("~ Коробка на основе двух других коробок: " + funal);

        line.addLine("Урок 10. Парсинг строк (использование substring для вытаскивания по id, и Integer.parseInt для перевода в другой тип");
        String example = "Это Иван, ему 34 года, его рост 185.3 см. Должность - программист";
        String nameMan = example.substring(4, 8);
        String ageMan = example.substring(14, 16);
        int newAgeMan = Integer.parseInt(ageMan);
        String heightMan = example.substring(32, 37);
        double newHeightMan = Double.parseDouble(heightMan);
        String jobMan = example.substring(54, 65);

        Man newMan = new Man(nameMan, jobMan, newAgeMan, newHeightMan);
        System.out.println("Парсинг главного предложения: " + example);
        System.out.println("Результат:");
        System.out.println("- Имя: " + newMan.getName());
        System.out.println("- Должность: " + newMan.getJob());
        System.out.println("- Возраст: " + newMan.getAge());
        System.out.println("- Рост: " + newMan.getHeight());

        line.addLine("Урок 11. Встроенные коллекции");
        ArrayList<String> students = new ArrayList<>();
        students.add("Вадим");
        students.add("Иван");
        students.add("Фёдор");
        students.add("Камилла");
        students.add("Виктория");
        students.add("Ванесса");
        students.add("Виктор");
        students.add("Николай");
        students.add("Григорий");
        students.add("Пётр");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        ArrayList<String> journal = new ArrayList<>();
        for (int j : numbers) {
            journal.add(numbers.get(j) + " " + students.get(j));
        }
        journal.forEach(System.out::println);

        line.addLine("Урок 12. Наследование, часть 1");
        Box boxMain = new Box(10, 10);
        BoxWidth boxWidth = new BoxWidth(10, 10, 10);
        boxMain.showInfo();
        System.out.println("____");
        boxWidth.showInfo();

        line.addLine("Урок 13. Наследование, часть 2");
        Triangle triangle = new Triangle(5, 10, 3);
        Rect rect = new Rect(10);
        System.out.println("Площадь треугольника: " + triangle.area());
        System.out.println("Площадь прямоугольника: " + rect.area());


        line.addLine("Урок 14. Интерфейсы, часть 1");
        Programmer dev1 = new Programmer("Сергей");
        Programmer dev2 = new Programmer("Святослав");
        Programmer dev3 = new Programmer("Мария");
        Driver driver1 = new Driver("Гося");
        Driver driver2 = new Driver("Райан Гослинг");
        Driver driver3 = new Driver("Махмуд");
        Cheif cheif1 = new Cheif("Алан Морган");
        Cheif cheif2 = new Cheif("Рупер");
        Cheif cheif3 = new Cheif("Николай");
        ArrayList<Jober> jobers = new ArrayList<>();
        jobers.add(dev1);
        jobers.add(dev2);
        jobers.add(dev3);
        jobers.add(driver1);
        jobers.add(driver2);
        jobers.add(driver3);
        jobers.add(cheif1);
        jobers.add(cheif2);
        jobers.add(cheif3);

        for (Jober jobs : jobers){
            jobs.voice();
        }


        for (Jober jober : jobers) {
            if (jober.getClass() == Driver.class){
                ((Driver) jober).doCarDriving();
            } else if (jober.getClass() == Cheif.class) {
                ((Cheif) jober).doCookPizza();
            } else if (jober.getClass() == Programmer.class){
                ((Programmer) jober).doProgramming();
            }
            }
        }
    }