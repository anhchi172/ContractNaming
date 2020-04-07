import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.Charset.*;

public class CSVReader {
    public static void main(String[] args) {
        List<Contract> contracts;
        contracts = readContractsFromCSV("C:\\Users\\Chi Hoang\\AppData\\Local\\Packages\\microsoft.windowscommunicationsapps_8wekyb3d8bbwe\\LocalState\\Files\\S0\\1782\\Attachments\\IDV 2.xlsx");
        //Debug print later can update to enter in portal
        for (Contract c : contracts) {
            System.out.print(c.toString());
        }

    }

    private static List<Contract> readContractsFromCSV(String fileName) {
        List<Contract> contracts = new ArrayList<>();
        Path filePath = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(filePath, lookupViaProviders("ISO-8859-1"))) {
            String line;
            line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Contract contract = createContract(attributes);
                contracts.add(contract);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (MalformedInputException m){

        }
        return contracts;
    }

    private static Contract createContract(String[] metadata){
        int piid = Integer.parseInt(metadata[0]);
        String name = metadata[1];
        return new Contract(piid, name);
    }
}
