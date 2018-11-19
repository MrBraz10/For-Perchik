package calendarSecond.repository;

import calendarSecond.model.Lesson;
import calendarSecond.service.Service;

import java.util.*;

public class LessonRepository {


  public Map<String, List<Lesson>> lessons = new TreeMap<>();


  public LessonRepository() {
    lessons.put("Пн", new ArrayList<>());
    lessons.put("Вт", new ArrayList<>());
    lessons.put("Ср", new ArrayList<>());

    Lesson l = new Lesson();
    l.setName("Матем");
    l.getDay().add("Пн");
    l.getDay().add("Вт");

    addLesson(l);

    Lesson l2 = new Lesson();
    l2.setName("Рус яз");
    l2.getDay().add("Пн");
    l2.getDay().add("Ср");

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
  String l;
  public String getDay(int day) {
    LessonRepository lessons = new LessonRepository();
    Map<String, List<Lesson>> all = lessons.getAll();
    if (day == 1) {


      String key = all.keySet().toArray(new String[all.size()])[0];
      List<Lesson> value = all.get(key);

        System.out.println(key);
      for (Lesson values: value) {
          System.out.println(values);
      }
    }
    return l;
  }

  public static void main(String[] args) {
    LessonRepository lessonRepository = new LessonRepository();
//    //получаем все пары
//    Map<String, List<Lesson>> all = lessonRepository.getAll();
//    // Пробегаемся по всем значениям карты
//    for (Map.Entry<String, List<Lesson>> stringListEntry : all.entrySet()) {
//      // получаем у дня все пары
//      List<Lesson> lessons = stringListEntry.getValue();
////      Печатаем день недели
//      System.out.println(stringListEntry.getKey());
////      Пробегаемся по всем парам текущего дня недели
//      for (Lesson lesson : lessons) {
////        Печаем каждую пару
//        System.out.println(lesson);
//      }
//    }
//
//    Service s = new Service();
//    System.out.println(s.currentDay());


    System.out.println(lessonRepository.getDay(1));


   }
}
