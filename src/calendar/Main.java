package calendar;

import excercises.calendar.model.Model;

public class Main {

    public static void main(String[] args) {
        Controller c = new Controller();
        View v = new View();
        Model m = new Model();

        v.printMenu();
        m.yourChoose(c.doPick());


    }
}
