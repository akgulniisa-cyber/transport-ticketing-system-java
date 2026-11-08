public class Reduction50 extends TicketSimple {

    private TicketSimple ticket;

    public Reduction50(TicketSimple ticket) {
        super(0, ticket.prix() / 2);
        this.ticket = ticket;
    }

    @Override
    public boolean valide() {
        return ticket.valide();
    }
}
