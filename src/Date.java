public class Date {

    private static Date maintenant;

    private int date;

    public Date(int date) {
        this.date = date;
    }

    public Date plus(int duree) {
        return new Date(date + duree);
    }

    public boolean avant(Date d) {
        return date < d.date;
    }

    public static Date getMaintenant() {
        return maintenant;
    }

    public static void setMaintenant(Date d) {
        maintenant = d;
    }
}
