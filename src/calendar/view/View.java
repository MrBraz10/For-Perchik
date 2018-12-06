package calendar.view;

import calendar.PickException;

import java.util.Scanner;

public class View {

    public int read() throws PickException {

      Scanner k = new Scanner(System.in);

      int number = k.nextInt();

        if (number == 1 || number == 2 || number == 3) {
            return number;
        } else {
            throw new PickException();
        }
    }

    public void print(String day) {
        System.out.println(day);
    }
  }


