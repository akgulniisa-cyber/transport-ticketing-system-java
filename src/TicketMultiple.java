public class TicketMultiple {

    private TicketRechargeable ticket;

    public TicketMultiple(int n) {
        ticket = new TicketRechargeable(n);
    }

    public int reste() {
        return ticket.reste();
    }

    public boolean valide() {
        return ticket.valide();
    }
}
