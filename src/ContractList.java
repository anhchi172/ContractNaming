import java.util.ArrayList;

public class ContractList {
    private ArrayList<Contract> al;

    public ContractList(){
        al = new ArrayList<>();
    }
    public void add(Contract c){
        al.add(c);
        //write al in file
    }



}
