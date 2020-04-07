public class Contract {
    private int piid;
    private String name;
    public Contract(int p, String n){
        piid = p;
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getPiid() {
        return piid;
    }

    @Override
    public String toString() {
        return ("Piid: " + piid + " Name: " + name);
    }
}
