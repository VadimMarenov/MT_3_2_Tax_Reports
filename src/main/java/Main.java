public class Main {
    final static int WAITING_FOR_COUNTS = 1000;

    public static void main(String[] args) {
        Tax tax = new Tax();
        Shop shop1 = new Shop("Shop 1", tax);
        Shop shop2 = new Shop("Shop 2", tax);
        Shop shop3 = new Shop("Shop 3", tax);

        shop1.start();
        shop2.start();
        shop3.start();

        try {
            Thread.sleep(WAITING_FOR_COUNTS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Total revenue from all three stores amounted to %d rubles", tax.getAmount());
    }
}
