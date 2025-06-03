public class AirplaneSystem {
    public static void main(String[] args) {
        CustomerA customer = new CustomerA();
        customer.address = "Chattogram";
        customer.reservation = "Confirmed";
        customer.details = "First Class";
        customer.add();

        TransactionA transaction = new TransactionA();
        transaction.details = "Online payment";
        transaction.listOfFish = "None";
        transaction.add();

        ReservationA reservation = new ReservationA();
        reservation.details = "Flight B123";
        reservation.ticketNumber = "TK56789";
        reservation.update();

        PaymentA payment = new PaymentA();
        payment.calculate(); // Default value 0 unless amount is set

        Crews crew = new Crews();
        crew.create();

        AirlineTicket ticket = new AirlineTicket();
        ticket.price = 5000;
        ticket.calculate();
    }
}
