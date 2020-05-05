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


        // Acronyms are usually inside brackets, unless bracket contains numbers
        // Limit length to 10
        if (name.contains("(") && name.contains(")")) {
            int startIndex = name.indexOf("(");
            int endIndex = name.indexOf(")");
            acronym = name.substring(startIndex + 1, endIndex);
        }

        else{
            acronym = name;
            // can be improved
        }

        if(name.contains("IGF::OT::IGF"))
            name.replaceAll("IGF::OT::IGF", "");
        if (name.contains("FOR OTHER FUNCTIONS"))
            name.replaceAll("FOR OTHER FUNCTION","");
        name.replaceAll('('acronym')', "")
        this.name = name;
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
