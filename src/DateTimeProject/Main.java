package DateTimeProject;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate five5 = LocalDate.of(2025, 5, 5);
        System.out.println(five5);

        LocalDate august5 = LocalDate.of(2025, Month.AUGUST, 5);
        System.out.println(august5);

        System.out.println(august5.getYear());
        System.out.println(august5.getMonth());

        System.out.println(august5.getDayOfMonth());
        System.out.println(august5.getDayOfWeek());
        System.out.println(august5.getDayOfYear());

        System.out.println(august5.withYear(2000));
        System.out.println(august5.withMonth(3));
        System.out.println(august5.withDayOfMonth(4));
        System.out.println(august5.withDayOfYear(126));
        System.out.println(august5);
        System.out.println(august5.with(ChronoField.DAY_OF_YEAR, 129));

        System.out.println(august5.plusYears(1));
        System.out.println(august5.plusMonths(12));
        System.out.println(august5.plusDays(365));
        System.out.println(august5.plusWeeks(52));

        System.out.println("Aug5 > today " + august5.isAfter(today));
        System.out.println("today > Aug5 " + august5.isBefore(today));

        System.out.println(today.isLeapYear());
        System.out.println(august5.minusYears(2).isLeapYear());

        System.out.println("---------------------------------------");
        august5.datesUntil(august5.plusDays(7))
                .forEach(System.out::println);

        System.out.println("---------------------------------------");
        august5.datesUntil(august5.plusYears(1), Period.ofDays(7))
                .forEach(System.out::println);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime sevenAM = LocalTime.of(7, 0);
        System.out.println(sevenAM);

        LocalTime sevenThirty = LocalTime.of(7, 30, 15);
        System.out.println(sevenThirty);

        LocalTime sevenPM = LocalTime.parse("19:00");
        LocalTime sevenThirtyPM = LocalTime.parse("19:30:15.1000");
        System.out.println(sevenPM.get(ChronoField.AMPM_OF_DAY));
        System.out.println(sevenThirtyPM.get(ChronoField.AMPM_OF_DAY));

        System.out.println(sevenThirtyPM.getHour());
        System.out.println(sevenThirtyPM.get(ChronoField.HOUR_OF_DAY));

        LocalDateTime todayAndNow = LocalDateTime.now();
        System.out.println(todayAndNow);

        LocalDateTime may5Noon = LocalDateTime.of(2024, 5, 5, 12, 0);
        System.out.printf("%tD %tr %n", may5Noon, may5Noon);
        System.out.printf("%1$tF %1$tT %n", may5Noon);

        System.out.println(todayAndNow.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(may5Noon.format(dtf));

        System.out.println(may5Noon.format(DateTimeFormatter.ofLocalizedTime(
                FormatStyle.MEDIUM
        )));
    }
}
