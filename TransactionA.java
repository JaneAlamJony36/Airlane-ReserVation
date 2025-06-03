public class TransactionA {
    protected int id;
    protected String details;
    protected String listOfFish;

    public void add() {
        System.out.println("Transaction added.");
    }

    public void update() {
        System.out.println("Transaction updated.");
    }
}