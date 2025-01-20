import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        String formatiraniDatumIVrijeme = dt.format(formatter);

        System.out.println(formatiraniDatumIVrijeme);
    }
}
