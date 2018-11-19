package calendarSecond.service;

import calendarSecond.model.Lesson;
import calendarSecond.repository.LessonRepository;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

public class Service {

    public String currentDay() {
        GregorianCalendar newCal = new GregorianCalendar();
        int day = newCal.get(Calendar.DAY_OF_WEEK);

        LessonRepository lessonRepository = new LessonRepository();
        Map<String, List<Lesson>> ls = lessonRepository.lessons;
      //  Map<String, List<Lesson>> d = ls.keySet().toArray()[day];
        String les = ls.values().toArray()[1].toString();

        String key = ls.keySet().toArray(new String[ls.size()])[1];
        List<Lesson> value = ls.get(key);

        String less = value.toString();


        Map<String, List<Lesson>> all = lessonRepository.getAll();
        // Пробегаемся по всем значениям карты
        for (Map.Entry<String, List<Lesson>> stringListEntry : all.entrySet()) {
            // получаем у дня все пары
            List<Lesson> lessons = stringListEntry.getValue();
//      Печатаем день недели
            System.out.println(stringListEntry.getKey());
//      Пробегаемся по всем парам текущего дня недели
            for (Lesson lesson : lessons) {
//        Печаем каждую пару
                System.out.println(lesson);
            }
        }return   les;
    }
}
