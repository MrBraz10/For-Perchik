package calendarSecond;

import calendarSecond.controller.Controller;
import calendarSecond.view.View;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller();

        System.out.println("1. Расписание на день");
        System.out.println("2. Расписание на неделю");
        System.out.println("3. Выход");

        while(true) {

            int enter = view.read();

            if (enter == 3) {
                break;
            } else {
                view.print(controller.needMethod(enter));
            }

        }

    }
}
