package calendarSecond.controller;

import calendarSecond.service.Service;
import calendarSecond.view.View;

public class Controller {



    public String needMethod(int enter) {

        if (enter == 1) {
            Service service = new Service();
            return service.currentDay();
        }
        if (enter == 2) {
            Service service = new Service();
            return service.allDays();
        } else {
            return "";
        }


    }
}
