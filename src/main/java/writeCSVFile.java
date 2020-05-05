import java.io.*;

public class writeCSVFile {
    public static void main(String[] args) {
        File file = new File("out.csv");
        BufferedWriter out = null;
        try{
            out = new BufferedWriter(new FileWriter(file));
            String string = "Piid, Name, Date Signed, Acronym";
            BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(string.getBytes())));
            String line;
            while ((line = reader.readLine())!=null){
                out.write(line.trim());
                out.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (out!= null){
                try{
                    out.close();
                }catch (IOException e){

                }
            }
        }
    }
}
