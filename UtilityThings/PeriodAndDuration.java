package UtilityThings;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {
    public static void main(String[] args) {


        LocalDate joiningDate = LocalDate.of(2015, 6, 23);
        LocalDate resignDate = LocalDate.now();

        Period period = Period.between(joiningDate, resignDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("years:" + years);
        System.out.println("Months:" + months);
        System.out.println("Days:" + days);

         // Finding total numbers of months passed between two dates
        long totalMonths = period.toTotalMonths();
        System.err.println("Total Months:" + totalMonths);
        // finding duration between two localtime values

        LocalTime startTime = LocalTime.of(12,00,23);
        LocalTime endTime = LocalTime.now();

        Duration duration = Duration.between(startTime,endTime);
        System.out.println(duration);

        //finding difference in two times in hours/minutes/seconds
        System.out.println("Hours:" + duration.toHours());
        System.out.println("Minutes:" + duration.toMinutes());
        System.out.println("Seconds:" + duration.getSeconds());


    }

}
