import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class scraper {

    public static void main(String[] args) throws IOException {

        // Make a URL to the web page
        URL url = new URL("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html");

        // Get the input stream through URL Connection
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
