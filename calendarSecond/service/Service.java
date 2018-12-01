package calendarSecond.service;

import calendarSecond.model.Lesson;
import calendarSecond.repository.LessonRepository;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

public class Service {

   private List<Lesson> day;

    public List<Lesson> getCurrentDaySchedule() {

        LessonRepository lessonRepository = new LessonRepository();

        Calendar c = Calendar.getInstance();
        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                day = lessonRepository.getByDay("MONDAY");
                break;
            case Calendar.TUESDAY:
                day = lessonRepository.getByDay("TUESDAY");
                break;
            case Calendar.WEDNESDAY:
                day = lessonRepository.getByDay("WEDNESDAY");
                break;
            case Calendar.THURSDAY:
                day = lessonRepository.getByDay("THURSDAY");
                break;
            case Calendar.FRIDAY:
                day = lessonRepository.getByDay("FRIDAY");
                break;
            case Calendar.SATURDAY:
                day = lessonRepository.getByDay("SATURDAY");
                break;
            case Calendar.SUNDAY:
                day = lessonRepository.getByDay("SUNDAY");
                break;
        }

        return day;
    }

    public Map<String, List<Lesson>> getWeekSchedule() {

        LessonRepository lessonRepository = new LessonRepository();

        Map<String, List<Lesson>> all = lessonRepository.getAll();

        return all;


    }
}
