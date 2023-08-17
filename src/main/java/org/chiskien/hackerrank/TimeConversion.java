package org.chiskien.hackerrank;

public class TimeConversion {


    public static String timeConversion(String s) {
        char timeAnnotation = s.charAt(s.length() - 2);
        String timeOnly = s.substring(0, s.length() - 2);
        String[] timeComponents = timeOnly.split(":");
        String result = "";
        if (timeAnnotation == 'A') {
            result += timeOnly;
        }
        if (timeAnnotation == 'P') {
            int hour = Integer.parseInt(timeComponents[0]);
            int newHour = 0;
            if (hour != 12) {
                newHour = hour + 12;
            }
            result += newHour + ":" + timeComponents[1] + ":" + timeComponents[2];
        }
        return result;
    }
}

