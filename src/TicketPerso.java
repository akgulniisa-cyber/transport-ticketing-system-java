public class TicketPerso extends TicketRechargeable {

    private TicketSimple abonnement;

    public TicketPerso() {
        super(0);
    }

    public boolean abonnement(int duree, float prix) {
        if (abonnementValide()) {
            return false;
        }
        abonnement = new TicketSimple(duree, prix);
        abonnement.valide();
        return true;
    }

    @Override
    public boolean valide() {
        if (abonnementValide()) {
            return true;
        }
        return super.valide();
    }

    private boolean abonnementValide() {
        return abonnement != null && abonnement.valide();
    }
}
