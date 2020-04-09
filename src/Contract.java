public class Contract {
    private int piid;
    private String name;
    private String dateSigned;
    private String acronym;

    public Contract(int p, String n, String d){
        piid = p;
        name = n;
        dateSigned = d;

    }


    public void setNameAcronym(String name) {

        /*String adjustedName = "";
        String typeContract = name.matches('B'['O','P']'A');
        adjustedName+= typeContract;*/
        if(name.contains("IGF::OT::IGF"))
            name.replaceAll("IGF::OT::IGF", "");
        this.name = name;

        // Acronyms are usually inside brackets
        if (name.contains("(") && name.contains(")")) {
            int startIndex = name.indexOf("(");
            int endIndex = name.indexOf(")");
            acronym = name.substring(startIndex + 1, endIndex);
        }
        else{
            acronym = name;
            // can be improved
        }
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
