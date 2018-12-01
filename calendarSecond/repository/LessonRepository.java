package calendarSecond.repository;

import calendarSecond.model.Lesson;
import calendarSecond.service.Service;

import java.util.*;

public class LessonRepository {


  private Map<String, List<Lesson>> lessons = new TreeMap<>();


  public LessonRepository() {
    lessons.put("SATURDAY", new ArrayList<>());
    lessons.put("TUESDAY", new ArrayList<>());
    lessons.put("WEDNESDAY", new ArrayList<>());



    Lesson l = new Lesson();
    l.setName("Матем");
    l.getDay().add("SATURDAY");
    l.getDay().add("TUESDAY");

    addLesson(l);

    Lesson l2 = new Lesson();
    l2.setName("Рус яз");
    l2.getDay().add("SATURDAY");
    l2.getDay().add("WEDNESDAY");

    addLesson(l2);



//    Сделать для всех дней недели
  }

  public Map<String, List<Lesson>> getAll() {
    return lessons;
  }


  public void addLesson(Lesson lesson) {
    // 1. Получить дни недели
    ArrayList<String> days = lesson.getDay();

    //    2. Пробежаться по дням недели и для каждого для созранить в lessons
    for (String day : days) {

      List<Lesson> all = lessons.get(day);
      all.add(lesson);
    }
  }

  public List<Lesson> getByDay(String day) {

    LessonRepository l = new LessonRepository();
    List<Lesson> lesson;

    lesson = l.lessons.get(day);

    return lesson;

  }

}
