import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.nio.charset.Charset.*;

public class CSVReader {
    public static void main(String[] args) {

        List<ContractList> contracts = (List<ContractList>) readContractsFromCSV("C:\\Users\\Chi Hoang\\AppData\\Local\\Packages\\microsoft.windowscommunicationsapps_8wekyb3d8bbwe\\LocalState\\Files\\S0\\1782\\Attachments\\IDV 2.xlsx");
        //Debug print later can update to enter in portal
        for (ContractList cl : contracts) {
            System.out.print(cl.toString());
        }

    }

    private static List<ContractList> readContractsFromCSV(String fileName) {
        List<ContractList> allContracts = new ArrayList<ContractList>();
        Path filePath = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(filePath, "ISO-8859-1")) {
            String line;
            line = br.readLine();
            while (line != null) {
                ContractList current = new ContractList();
                String[] attributes = line.split(",");
                Contract contract = createContract(attributes);
                while (current.isGrouped()== true) {
                    current.group(contract);
                    line = br.readLine();
                }
                allContracts.add(current);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (MalformedInputException m){
            m.printStackTrace();
        }
        return allContracts;
    }

    private static Contract createContract(String[] metadata){
        int piid = Integer.parseInt(metadata[0]);
        String name = metadata[1];
        String dateSigned = metadata[3];
         Contract c = new Contract(piid, name, dateSigned);
         c.setNameAcronym(name);
         return c;

    }
}
