import java.util.concurrent.atomic.AtomicLong;

public class Tax {
    AtomicLong revenue = new AtomicLong(0);

    public void transfer(long diff) {
        System.out.printf("%s provided a report in the amount of %d rubles \n", Thread.currentThread().getName(), diff);
        revenue.addAndGet(diff);
    }

    public long getAmount() {
        return revenue.get();
    }
}
