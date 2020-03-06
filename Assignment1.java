import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Assignment1 {
    public static Calendar getLastFriday(Calendar cal, int offset) {
        int dayofweek;
        cal.set(Calendar.MONTH, offset);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayofweek < Calendar.FRIDAY)
            cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 7
                    + Calendar.FRIDAY - dayofweek);
        else
            cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)
                    + Calendar.FRIDAY - dayofweek);

        return cal;
    }

    public static List<Calendar> getLastFridayofMonth(String dateStr) throws ParseException {
        final String DATE_FORMAT_NOW = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        Date date = sdf.parse(dateStr);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        List<Calendar> calendars = new ArrayList<>();
            cal = getLastFriday(cal,Calendar.JANUARY);
            calendars.add(cal);
            System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.FEBRUARY);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.MARCH);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.APRIL);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.MAY);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.JUNE);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.JULY);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.AUGUST);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.SEPTEMBER);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.OCTOBER);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.NOVEMBER);
            calendars.add(cal);
        System.out.println(cal.getTime());
            cal = getLastFriday(cal,Calendar.DECEMBER);
            calendars.add(cal);
        System.out.println(cal.getTime());


        return calendars;
    }

    public static void main(String[] args) throws ParseException {
        getLastFridayofMonth("01-01-2015");
    }



}
