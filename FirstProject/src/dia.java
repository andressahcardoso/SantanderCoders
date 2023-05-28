import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.time.format.TextStyle;
// import java.util.Locale;


public class dia {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        // Locale brasil = new Locale("pt", "BR");

        LocalDateTime hora = LocalDateTime.now();

        System.out.printf("Hoje é dia %s e são %n", hoje, hora);

    }
}
