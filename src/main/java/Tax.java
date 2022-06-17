import java.util.concurrent.atomic.LongAdder;

public class Tax {
    private LongAdder revenue = new LongAdder();

    public void transfer(long diff) {
        System.out.printf("%s provided a report in the amount of %d rubles \n", Thread.currentThread().getName(), diff);
        revenue.add(diff);
    }

    public long getAmount() {
        return revenue.longValue();
    }
}
