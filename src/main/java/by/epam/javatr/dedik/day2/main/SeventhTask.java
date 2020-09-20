package by.epam.javatr.dedik.day2.main;

import by.epam.javatr.dedik.day2.service.StringUtility;

import java.util.Calendar;

public class SeventhTask {
    public static void main(String[] args) {
        StringUtility utility = new StringUtility();
        Calendar calendar = utility.toDate(args);

        System.out.printf("Birthday: %s%n" , calendar.get(Calendar.DAY_OF_WEEK));
        System.out.printf("Full years: %d%n", calendar.get(Calendar.YEAR) -2000);
        System.out.printf("Is today: %s%n", utility.isToday(calendar));
    }
}
