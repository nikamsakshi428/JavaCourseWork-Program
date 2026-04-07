import java.text.SimpleDateFormat;
import java.util.Date;

public class Prog85 {
    public static void main(String[] args) throws Exception {
        String s = "2025-10-04";
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = f.parse(s);
        System.out.println(d);
    }
}