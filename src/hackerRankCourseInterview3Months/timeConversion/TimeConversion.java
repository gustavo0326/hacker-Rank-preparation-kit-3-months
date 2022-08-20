package hackerRankCourseInterview3Months.timeConversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {
    private static final DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
    private static final DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");

    static String timeConversion(String s) {

        String str = null;
        try {
            str= TWENTY_FOUR_TF.format(
                    TWELVE_TF.parse(s));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return str;

    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));

    }

}
