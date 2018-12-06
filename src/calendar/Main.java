package calendar;

import calendar.controller.Controller;
import calendar.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller();

        System.out.println("1. Расписание на день");
        System.out.println("2. Расписание на неделю");
        System.out.println("3. Выход");

//         public LessonRepository() {
//            lessons.put("SATURDAY", new ArrayList<>());
//            lessons.put("TUESDAY", new ArrayList<>());
//            lessons.put("WEDNESDAY", new ArrayList<>());
//
//
//
//            Lesson l = new Lesson();
//            l.setName("Матем");
//            l.getDay().add("SATURDAY");
//            l.getDay().add("TUESDAY");
//
//            addLesson(l);
//
//            Lesson l2 = new Lesson();
//            l2.setName("Рус яз");
//            l2.getDay().add("SATURDAY");
//            l2.getDay().add("WEDNESDAY");
//
//            addLesson(l2);
//
//
//
////    Сделать для всех дней недели
//        }

        while(true) {

            try {
                int enter = view.read();

                if (enter == 3) {
                    break;
                } else {
                    view.print(controller.needMethod(enter));
                }
            }
            catch(PickException ex) {
                ex.printStackTrace();
                System.out.println("Ввел не верную цифру");
                break;
            }
        }

    }
}
