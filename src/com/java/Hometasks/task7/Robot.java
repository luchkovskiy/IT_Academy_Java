package com.java.Hometasks.task7;


public class Robot {
    BodyFactory body = new BodyFactory();
    HeadFactory head = new HeadFactory();

    public int x = 0;
    String[] robotName = {"Вася", "Петя", "Маша", "Коля", "Степан", "Леонид", "Валера", "Даша", "Артур"};

    public void createRobot() {
        int i;
        int j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Параметры робота " + "по имени " + robotName[x] + ":");
                x++;
                createBody(i);
                createHead(j);
            }
        }
    }

    private void createBody(int i) {
        body.createRobotPart(i);
        System.out.println(body);
    }

    private void createHead(int j) {
        head.createRobotPart(j);
        System.out.println(head);
    }

}
