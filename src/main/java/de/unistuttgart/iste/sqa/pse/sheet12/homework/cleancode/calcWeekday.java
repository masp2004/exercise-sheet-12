package de.unistuttgart.iste.sqa.pse.sheet12.homework.cleancode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


/**
 * A class that accepts different date formats and prints the day of the week.
 *
 * @author MarvinSpiegel, Ismail Ratni
 */
public class calcWeekday {

    private static final DateTimeFormatter[] FORMATTERS = new DateTimeFormatter[] {
            DateTimeFormatter.ofPattern("yyyy-MM-dd"),
            DateTimeFormatter.ofPattern("yyyy/MM/dd"),
            DateTimeFormatter.ofPattern("yyyy.MM.dd")
    };

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date in one of the following formats: yyyy-MM-dd, yyyy/MM/dd, yyyy.MM.dd");

        final String input = scanner.nextLine();
        LocalDate date = parseDate(input);

        if (date != null) {
            System.out.println("The day of the week is: " + date.getDayOfWeek());
        } else {
            System.out.println("Invalid date format.");
        }
    }

    /**
     * Parses a date from a string.
     *
     * @param input the string to parse
     * @return the parsed date or null if the input is not a valid date
     */
    private static LocalDate parseDate(final String input) {
        /*@
        @ loop_invariant i >= 0 && i <= FORMATTERS.length;
        @ decreases FORMATTERS.length - i;
         */
        for (DateTimeFormatter formatter : FORMATTERS) {
            try {
                return LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                // ignore and try the next format
            }
        }
        return null;
    }
}