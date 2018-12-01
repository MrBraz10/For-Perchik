package calendarSecond.controller;

import calendarSecond.service.Service;
import calendarSecond.view.View;

public class Controller {



    public String needMethod(int enter) {

        if (enter == 1) {
            Service service = new Service();
            String lessons = service.getCurrentDaySchedule().toString();
            return lessons;
        }
        if (enter == 2) {
            Service service = new Service();
            String days = service.getWeekSchedule().toString();
            return days;
    }
         else {
            return "";
        }


    }
}
