public class TicketSimple {

    private int duree;
    private float prix;
    private Date limite;

    public TicketSimple(int duree, float prix) {
        this.duree = duree;
        this.prix = prix;
    }

    public float prix() {
        return prix;
    }

    public boolean valide() {
        if (limite == null) {
            limite = Date.getMaintenant().plus(duree);
            return true;
        }
        return Date.getMaintenant().avant(limite);
    }
}
