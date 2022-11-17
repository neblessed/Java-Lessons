package intrface2;

public class Director {
    public void force(Counter counter, int months) {
        counter.newReport(months);
    }
}
