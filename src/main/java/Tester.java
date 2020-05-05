/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tester {
    public static void main(String[] args) {
        ContractList c = new ContractList();
        ArrayList<Integer> piid = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        try{
        File csvFile = new File("C:\\Users\\Chi Hoang\\Downloads\\FY2020_archived_opportunities (1).csv");
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line = "";
        StringTokenizer st = null;
        int lineNumber = 0;
        int tokenNumber = 0;
        while ((line = br.readLine())!= null){
            String[] arr = line.split(",");

            lineNumber++;
            st = new StringTokenizer(line, ",");
            while (st.hasMoreTokens()){
                tokenNumber++;
                String sd = st.nextToken() +"";
                if (sd!= null){
                    names.add(sd);
                }
            }
        }
    }
}
*/