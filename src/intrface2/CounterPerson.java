package intrface2;

public class CounterPerson implements Counter {

    @Override
    public void newReport(int months) {
        System.out.println("Âמע מעק¸ע חא " + months + " לוסÿצוג");
    }
}
