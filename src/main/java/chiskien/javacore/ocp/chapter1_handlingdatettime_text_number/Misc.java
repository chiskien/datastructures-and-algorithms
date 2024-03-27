package chiskien.javacore.ocp.chapter1_handlingdatettime_text_number;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

class Misc {
    public static void main(String[] args) {
        Misc misc = new Misc();
        misc.ocp17_1_19();
    }

    private void ocp17_1_16() {
        var line = new String("-");
        var anotherLine = line.concat("-");
        System.out.println(line == anotherLine);
        System.out.println(line.length());
    }

    //How many compile errors does this code below produce ?
    private void pi() {
//        byte b = 3.14;
//        double d = 3.14;
//        float f = 3.14;
//        short s = 3.14;

    }

    private void ocp17_1_18() {
        LocalDate localDate = LocalDate.of(2024, Month.FEBRUARY, 29);
        LocalTime localTime = LocalTime.of(1, 0);
        ZoneId zoneId = ZoneId.of("Europe/London");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
        ZoneOffset offset = zonedDateTime.getOffset();
        System.out.println(zonedDateTime.getZone().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        Period period = Period.of(1, 1, 11);
        for (int i = 0; i < 6; i++) {
            zonedDateTime = zonedDateTime.plusHours(1);
        }
        System.out.println(zonedDateTime.getHour() + " " + offset.equals(zonedDateTime.getOffset()));
    }

    private void ocp17_1_19() {
        int first = 8;
        int second = ~first;
        int third = ~second;
        System.out.println(second + " " + third);
    }

    private void ocp17_1_22() {
        String p = """
                ant antelope \s \n
                cat "kitchen"
                seal sea lion
                """;
        System.out.println(p);
    }
}
