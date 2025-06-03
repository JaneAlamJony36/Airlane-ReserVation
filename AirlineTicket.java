public class AirlineTicket {
    int id;
    int number;
    String details;
    int price;

    public void calculate() {
        System.out.println("Ticket price: " + price);
    }

    public void update() {
        System.out.println("Airline ticket updated.");
    }
}