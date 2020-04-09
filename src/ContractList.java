import java.util.ArrayList;

public class ContractList {
    private ArrayList<Contract> al;
    boolean grouped;

    public ContractList(){
        al = new ArrayList<>();
        grouped = true;
    }

    public boolean isGrouped() {
        return grouped;
    }

    @Override
    public String toString() {
        String res = "";
        for(Contract c: al){
            res += c.toString() +"\n";
        }
        return res;
    }

    public void group(Contract c){
        if (al!= null){
            al.add(c);
        }
        else {
            if(al.get(0).getDateSigned().equals(c.getDateSigned()))
                al.add(c);
            // System.out.println("Successful grouping");
            else{
                System.out.print("Contract " + c.getName() +" does not belong to this group. ");
                grouped = false;
            }
        }

    }




}
