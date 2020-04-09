public class Contract {
    private int piid;
    private String name;
    private String dateSigned;

    public Contract(int p, String n, String d){
        piid = p;
        name = n;
        dateSigned = d;
    }

    public String getName() {
        return name;
    }

    public int getPiid() {
        return piid;
    }

    public String getDateSigned() {
        return dateSigned;
    }

    @Override
    public String toString() {
        return ("Piid: " + piid + " Name: " + name);
    }

}
