package intrface2;

public class CounterPerson implements Counter {

    @Override
    public void newReport(int months) {
        System.out.println("��� ����� �� " + months + " �������");
    }
}
