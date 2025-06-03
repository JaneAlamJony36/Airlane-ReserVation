public class PaymentA {
    private int id;
    private int amount;
    private String date;

    protected void calculate() {
        System.out.println("Total amount: " + amount);
    }
}
