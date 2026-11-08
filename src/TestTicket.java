public class TestTicket {

    public static void main(String[] args) {
        // Ticket personnel : abonnement d'un mois + 1 voyage
        TicketPerso t = new TicketPerso();
        Date.setMaintenant(new Date(1001131345));
        t.abonnement(Duree.MOIS, 42f);
        t.recharge(1);
        System.out.println(t.valide());   // true  : abonnement en cours

        Date.setMaintenant(Date.getMaintenant().plus(Duree.MOIS));
        System.out.println(t.valide());   // true  : abonnement expiré, on utilise le voyage restant

        Date.setMaintenant(Date.getMaintenant().plus(Duree.HEURE));
        System.out.println(t.valide());   // false : plus d'abonnement ni de voyage

        // Réduction de 50 % sur un ticket 1 jour
        TicketSimple t2 = new Reduction50(new Ticket1jour());
        t2.valide();
        System.out.println(t2.prix());    // 2.5
    }
}
