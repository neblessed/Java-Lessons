import java.util.ArrayList;

import intrface.*;
import intrface.Jober;

public class Main {
    public static void main(String[] args) {
        Liner line = new Liner();
        System.out.println("~~~~~~~~~~~~ JAVA ROAD TO JUNIOR. Tokaev V.A. ~~~~~~~~~~~~~~~~");
        line.addLine("���� 3. ������������������� ������ (Rectangle)");

        Rectangle rectangle = new Rectangle();
        rectangle.setParams(10, 10);
        System.out.println(rectangle.checkPerimeter());
        System.out.println(rectangle.checkValue());


        line.addLine("���� 4. ������������������� ������ (Worker)");
        Worker worker = new Worker("�����", "QA", 25000);
        worker.checkSalaryForPeriod(6);

        line.addLine("���� 5. ���������� �������/�������������. �������� ����� static");
        int b = Rectangle.upStepen(19); //static-�����, �� ����������� ��������� ������ ������. ����� ���������� (�����.�����)
        System.out.println("! ���������� � �������, static-�����: " + b);
        Monster zuli = new Monster(1, 4, 2);
        Monster rick = new Monster();
        Monster fops = new Monster(6);
        System.out.println("������ ������ �����: ");
        zuli.voice();
        System.out.println("������ ����� ����������� ���-�� ���: ");
        rick.voice(3);
        System.out.println("�������� ��-����������, ����������� ���-�� ���: ");
        fops.voice(2, "Rrraw");

        line.addLine("���� 6. ������� � �������� ���������� � ������� ��������");
        Box box = new Box(10, 10);
        Box box2 = new Box(box, 10);
        double f = box.volume();
        double g = box2.volume();
        System.out.println("������� ������ �������: " + f);
        System.out.println("������� ������ �������: " + g);
        int result = box.compare(box2);
        switch (result) {
            case -1:
                System.out.println("���� ������� ������");
                break;
            case 1:
                System.out.println("���� ������� ������");
                break;
            case 0:
                System.out.println("���� ������� �����");
                break;
        }
        Box boxNew = new Box(box, box2);
        double funal = boxNew.volume();
        System.out.println("~ ������� �� ������ ���� ������ �������: " + funal);

        line.addLine("���� 10. ������� ����� (������������� substring ��� ������������ �� id, � Integer.parseInt ��� �������� � ������ ���");
        String example = "��� ����, ��� 34 ����, ��� ���� 185.3 ��. ��������� - �����������";
        String nameMan = example.substring(4, 8);
        String ageMan = example.substring(14, 16);
        int newAgeMan = Integer.parseInt(ageMan);
        String heightMan = example.substring(32, 37);
        double newHeightMan = Double.parseDouble(heightMan);
        String jobMan = example.substring(54, 65);

        Man newMan = new Man(nameMan, jobMan, newAgeMan, newHeightMan);
        System.out.println("������� �������� �����������: " + example);
        System.out.println("���������:");
        System.out.println("- ���: " + newMan.getName());
        System.out.println("- ���������: " + newMan.getJob());
        System.out.println("- �������: " + newMan.getAge());
        System.out.println("- ����: " + newMan.getHeight());

        line.addLine("���� 11. ���������� ���������");
        ArrayList<String> students = new ArrayList<>();
        students.add("�����");
        students.add("����");
        students.add("Ը���");
        students.add("�������");
        students.add("��������");
        students.add("�������");
        students.add("������");
        students.add("�������");
        students.add("��������");
        students.add("ϸ��");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        ArrayList<String> journal = new ArrayList<>();
        for (int j : numbers) {
            journal.add(numbers.get(j) + " " + students.get(j));
        }
        journal.forEach(System.out::println);

        line.addLine("���� 12. ������������, ����� 1");
        Box boxMain = new Box(10, 10);
        BoxWidth boxWidth = new BoxWidth(10, 10, 10);
        boxMain.showInfo();
        System.out.println("____");
        boxWidth.showInfo();

        line.addLine("���� 13. ������������, ����� 2");
        Triangle triangle = new Triangle(5, 10, 3);
        Rect rect = new Rect(10);
        System.out.println("������� ������������: " + triangle.area());
        System.out.println("������� ��������������: " + rect.area());


        line.addLine("���� 14. ����������, ����� 1");
        Programmer dev1 = new Programmer("������");
        Programmer dev2 = new Programmer("���������");
        Programmer dev3 = new Programmer("�����");
        Driver driver1 = new Driver("����");
        Driver driver2 = new Driver("����� �������");
        Driver driver3 = new Driver("������");
        Cheif cheif1 = new Cheif("���� ������");
        Cheif cheif2 = new Cheif("�����");
        Cheif cheif3 = new Cheif("�������");
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