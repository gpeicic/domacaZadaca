import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Dohvati trenutni datum i vrijeme
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String formattedTime = now.format(DateTimeFormatter.ofPattern("HH:mm"));

        // ASCII prikaz znamenki
        String[][] digits = {
                {
                        " ███ ", // 0
                        "█   █",
                        "█   █",
                        "█   █",
                        " ███ "
                },
                {
                        "  █  ", // 1
                        " ██  ",
                        "  █  ",
                        "  █  ",
                        " ███ "
                },
                {
                        " ███ ", // 2
                        "    █",
                        " ███ ",
                        "█    ",
                        "█████"
                },
                {
                        " ███ ", // 3
                        "    █",
                        " ███ ",
                        "    █",
                        " ███ "
                },
                {
                        "█   █", // 4
                        "█   █",
                        "█████",
                        "    █",
                        "    █"
                },
                {
                        "█████", // 5
                        "█    ",
                        " ███ ",
                        "    █",
                        " ███ "
                },
                {
                        " ███ ", // 6
                        "█    ",
                        "████ ",
                        "█   █",
                        " ███ "
                },
                {
                        "█████", // 7
                        "    █",
                        "   █ ",
                        "  █  ",
                        " █   "
                },
                {
                        " ███ ", // 8
                        "█   █",
                        " ███ ",
                        "█   █",
                        " ███ "
                },
                {
                        " ███ ", // 9
                        "█   █",
                        " ████",
                        "    █",
                        " ███ "
                },
                {
                        "     ", // space for ":"
                        "  ░  ",
                        "     ",
                        "  ░  ",
                        "     "
                },
                {
                        "     ", // space for "."
                        "     ",
                        "  █  ",
                        "     ",
                        "     "
                }
        };

        // Ispis za datum
        System.out.println("Trenutni datum:");
        printLargeClock(formattedDate, digits);
        System.out.println("\nTrenutno vrijeme:");
        printLargeClock(formattedTime, digits);
    }

    // Funkcija za ispis brojeva u velikom formatu
    public static void printLargeClock(String input, String[][] digits) {
        // Svaka linija se gradi zasebno
        StringBuilder[] lines = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            lines[i] = new StringBuilder();
        }

        // Iteracija kroz svaki znak u inputu
        for (char ch : input.toCharArray()) {
            int index;
            if (ch == ':') {
                index = 10; // Pozicija za ":"
            } else if (ch == '.') {
                index = 11; // Pozicija za "."
            } else if (Character.isDigit(ch)) {
                index = ch - '0'; // Pretvaranje broja u indeks
            } else {
                continue; // Preskoči nepoznate znakove
            }

            for (int i = 0; i < 5; i++) {
                lines[i].append(digits[index][i]).append(" ");
            }
        }

        // Ispis linija
        for (StringBuilder line : lines) {
            System.out.println(line.toString());
        }
    }
}
