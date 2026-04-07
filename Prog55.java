import java.text.SimpleDateFormat;
import java.util.Date;

public class Prog55 {
    public static void main(String[] args) {
        Date date = new Date(); 
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = formatter.format(date);

      System.out.println( formattedDate);
    }
}