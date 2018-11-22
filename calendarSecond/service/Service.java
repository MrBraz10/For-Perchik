package calendarSecond.service;

import calendarSecond.model.Lesson;
import calendarSecond.repository.LessonRepository;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

public class Service {

    public String currentDay() {
        LessonRepository lessonRepository = new LessonRepository();

        String day = "";
        Calendar c = Calendar.getInstance();
        switch (c.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                day = lessonRepository.lessons.get("MONDAY").toString();
                break;
            case Calendar.TUESDAY:
                day = lessonRepository.lessons.get("TUESDAY").toString();
                break;
            case Calendar.WEDNESDAY:
                day = lessonRepository.lessons.get("WEDNESDAY").toString();
                break;
            case Calendar.THURSDAY:
                day = lessonRepository.lessons.get("THURSDAY").toString();
                break;
            case Calendar.FRIDAY:
                day = lessonRepository.lessons.get("FRIDAY").toString();
                break;
            case Calendar.SATURDAY:
                day = lessonRepository.lessons.get("SATURDAY").toString();
                break;
            case Calendar.SUNDAY:
                day = lessonRepository.lessons.get("SUNDAY").toString();
                break;
        }

        return day;
    }

    public String allDays() {

        LessonRepository lessonRepository = new LessonRepository();

        Map<String, List<Lesson>> all = lessonRepository.getAll();

        String days = all.toString();

        return days;


    }
}
