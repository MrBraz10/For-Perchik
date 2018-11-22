package calendarSecond.view;

import java.util.Scanner;

public class View {

    public int read() {

      Scanner k = new Scanner(System.in);

      int number = k.nextInt();

      return number;
    }

    public void print(String day) {
        System.out.println(day);
    }
  }


