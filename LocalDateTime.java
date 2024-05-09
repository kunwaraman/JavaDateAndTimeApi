import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {
    public static void main(String[] args) {
        // creating localdate time object using now()
        java.time.LocalDateTime dateTime = java.time.LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate date = dateTime.toLocalDate();
        System.out.println(date);
       // converting localdate time to localtime
        LocalTime time = dateTime.toLocalTime();
        System.out.println(time);

        // creating localdatetime object using of()
        int dayOfMonth = 12;
        int month = 4;
        int year = 2019;
        int hour = 13;
        int min = 34;

        java.time.LocalDateTime dateTime1 = java.time.LocalDateTime.of(year,month,dayOfMonth,hour,min);
        System.out.println(dateTime1);

        // converting java.time.localdatetime to java.sql.Timestamp;

        java.time.LocalDateTime current = java.time.LocalDateTime.now();
        System.out.println("LDT:" + current);

        Timestamp timestamp = Timestamp.valueOf(current);
        System.out.println("SQL Timestamp:" + timestamp);

        // converting java.sql.timestamp to java.time.localDateTime
        java.time.LocalDateTime dtFromTimestamp = timestamp.toLocalDateTime();
        System.out.println(dtFromTimestamp);

        // constructing LocalDate Time using localdate and LocalTime object
//        java.time.LocalDate myDate = java.time.LocalDate.of(2013,9,12);
         LocalDate myDate = LocalDate.of(2013,9,12);
         LocalTime myTime = LocalTime.of(12,30);

        java.time.LocalDateTime myDateTime = java.time.LocalDateTime.of(myDate,myTime);
        System.out.println(myDateTime);




    }
}
