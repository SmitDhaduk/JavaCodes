import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class SpecificFormat {
    // This code will format the date in specific format.
    public static void main(String[] args) {
        String formate = "MM-dd-YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formate);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
    
}
