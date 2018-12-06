package calendar.controller;

import calendar.service.Service;

public class Controller {



    public String needMethod(int enter) {
        Service service = new Service();
        if (enter == 1) {
            String lessons = service.getCurrentDaySchedule().toString();
            return lessons;
        }
        if (enter == 2) {
            String days = service.getWeekSchedule().toString();
            return days;
    }
         else {
            return "";
        }


    }
}
