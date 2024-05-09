import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class CreateLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int year = 2023;
        int month = 05;
        int dayOfMonth = 9;

        LocalDate date1 = LocalDate.of(year,month,dayOfMonth);
        System.out.println(date1);

        Month monthFromdate = date1.getMonth();
        System.out.println(monthFromdate);

        int monthInInteger = date1.getMonthValue();
        System.out.println("Month is :" + monthInInteger);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        // Adding days/months to the localdate
        LocalDate currentPlusFive = date.plusDays(5);
        System.out.println(date+"after 5 days" + currentPlusFive);

        LocalDate afterOneMonth = currentPlusFive.plusMonths(1);
        System.out.println(afterOneMonth);

        // Finding number of days in a year and month

        int lengthOfYear = date.lengthOfYear();
        System.out.println(lengthOfYear);

        int lengthofMonth = currentPlusFive.lengthOfMonth();
        System.out.println(lengthofMonth);

        // converting java.util.date to java.time.localdate
        Date dt = new Date();
        LocalDate localDateFromDate = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(dt + " --- " + localDateFromDate);
        // converting String to localdate

        String dateInStringFormat ="2020-09-12";
        LocalDate dateFromString = LocalDate.parse(dateInStringFormat);
        System.out.println(dateInStringFormat);

     //   ProcessHandleImpl dateFromString;
        String stringFromDate = dateFromString.toString();
        System.out.println(stringFromDate);

















    }
}
