package chiskien.javacore.misc;

import java.util.ArrayList;
import java.util.List;

public class ConvertDateTimeToUnixTimestamp {
    public static void main(String[] args) {

        String[] sent = {
                "16:47:04.039",
                "16:47:11.072",
                "16:47:04.004",
                "16:47:04.035",
                "16:47:04.241",
                "16:47:04.241",
                "16:47:04.253",
                "16:47:04.253",
                "16:47:04.256",
                "16:47:04.383"
        };


        String[] received = {
                "16:47:04.728",
                "16:47:11.058",
                "16:47:04.208",
                "16:47:04.619",
                "16:47:04.241",
                "16:47:04.780",
                "16:47:04.861",
                "16:47:04.847",
                "16:47:04.897",
                "16:47:04.996"
        };


        List<Long> milliseconds = new ArrayList<>();

        for (int i = 0; i < received.length; i++) {
            String receivedTime = received[i];
            String sentTime = sent[i];


            long receivedTimeInMilliseconds = convertToMilliseconds(receivedTime);
            long sentTimeInMilliseconds = convertToMilliseconds(sentTime);

            milliseconds.add((sentTimeInMilliseconds - receivedTimeInMilliseconds));
        }

        for (long time : milliseconds) {
            System.out.println(time);
        }
    }

    private static long convertToMilliseconds(String receivedTime) {

        String[] time = receivedTime.split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        String[] secondsAndMilliseconds = time[2].split("\\.");
        int seconds = Integer.parseInt(secondsAndMilliseconds[0]);
        int milliseconds = Integer.parseInt(secondsAndMilliseconds[1]);
        return hours * 3600000L + minutes * 60000L + seconds * 1000L + milliseconds;
    }
}