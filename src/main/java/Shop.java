import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop extends Thread {
    final int RANDOM_AMOUNT = 50000;
    final int COUNT_OF_REVENUE = 10;
    Tax tax;
    static Random random = new Random();

    public Shop(String name, Tax tax) {
        super(name);
        this.tax = tax;
    }


    @Override
    public void run() {
        List<Long> revenue = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_REVENUE; i++) {
            revenue.add(random.nextLong(RANDOM_AMOUNT));
        }
        for (long value : revenue) {
            tax.transfer(random.nextLong(value));
        }
    }
}
