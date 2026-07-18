package Task1;

import java.io.*;
import java.net.*;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {
        // first, create the url
        double answer = 0;
        double sum = 0;
        int count = 0;
        BufferedReader bufferedstream = null;
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {

            InputStream istream = myUrl.openStream();

            InputStreamReader istreamreader = new InputStreamReader(istream);

            BufferedReader reader = new BufferedReader(istreamreader);
            String line = "";
            StringBuilder response = new StringBuilder();
            String[] columnNames = new String[0];
            boolean header = true;

            while ((line = reader.readLine()) != null) {
                if (line != null) {
                    if (header) {
                        columnNames = line.split(";");
                        header = false;
                    } else {
                        String[] columns = line.split(";");
                        System.out.println(columnNames[1] + " : " + columns[1] + ", ");

                        if (!Objects.equals(columns[1], "*")) {
                            count += 1;
                            sum += Double.parseDouble(columns[1].replace(',', '.'));
                        }
                    }
                }
            } answer = sum/count;
            response.append(line);
            System.out.println(answer);
        }
        catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (bufferedstream != null)
                    bufferedstream.close();
            } catch (Exception e) {
                System.out.println("Error while closing the file");
            }
        }
    }
}