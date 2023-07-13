import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateHour {
    public static void main(String[] args) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        Instant d03 = Instant.now();
        System.out.println(d03);

        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T20:20:23");
        System.out.println(d05);

        Instant d06 = Instant.parse("2022-07-20T20:20:23Z");
        System.out.println(d06);

        LocalDate d07 = LocalDate.parse("20/07/2022", fmt01);
        System.out.println(d07);

        System.out.println(d07.format(fmt01));
        System.out.println(fmt01.format(d07));
        System.out.println(fmt02.format(d02));
        System.out.println(fmt02.format(d02));

        LocalDateTime tmz01 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println(tmz01);

        System.out.println(tmz01.getDayOfMonth());
        System.out.println(tmz01.getDayOfWeek());

        LocalDate pastWeek = d01.minusDays(7);
        System.out.println(pastWeek);

        LocalDate pastYear = d01.minus(7, ChronoUnit.DAYS);
        System.out.println(pastYear);

        Duration t1 = Duration.between(d02, d05);
        System.out.println(t1.toDays());
    }
}

