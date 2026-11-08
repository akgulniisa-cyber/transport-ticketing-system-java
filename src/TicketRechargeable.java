public class TicketRechargeable {

    private int reste;
    private TicketSolo voyage;

    public TicketRechargeable(int n) {
        this.reste = n;
    }

    public int reste() {
        return reste;
    }

    public void recharge(int n) {
        reste += n;
    }

    public boolean valide() {
        if (voyage != null && voyage.valide()) {
            return true;
        }
        if (reste > 0) {
            reste--;
            voyage = new TicketSolo();
            return voyage.valide();
        }
        return false;
    }
}
