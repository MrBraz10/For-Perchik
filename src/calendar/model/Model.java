package calendar.model;

import calendar.View;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Model {

    public int currectDay() {

        GregorianCalendar newCal = new GregorianCalendar();
        int day = newCal.get(Calendar.DAY_OF_WEEK);
        return day;

    }

    public void yourChoose(int number) {

        View v = new View();



        if (number == 1) {
            switch (currectDay()) {
                case 1:
                    v.printMonday();
                    break;
                case 2:
                    v.printTuesday();
                    break;
                case 3:
                    v.printWednesday();
                    break;
                case 4:
                    v.printFirsday();
                    break;
                case 5:
                    v.printFryday();
                    break;
                case 6:
                    v.printSaturday();
                    break;
                case 7:
                    v.printSunday();
                    break;
            }
        } else if (number == 2) {
            v.allDays();
        } else {
            System.out.println("дурак что ли ?");
        }

    }
}
