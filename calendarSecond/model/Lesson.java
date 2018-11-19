package calendarSecond.model;

import java.util.ArrayList;

public class Lesson {

  private String name;

  private ArrayList<String> day = new ArrayList<>();


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getDay() {
    return day;
  }

  public void setDay(ArrayList<String> day) {
    this.day = day;
  }

  @Override
  public String toString() {
    return "Lesson{" +
            "name='" + name + '\'' +
            ", day=" + day +
            '}';
  }
}
