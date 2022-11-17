package com.java.Hometasks.task7;


public class Robot {
    BodyFactory bodyFactory = new BodyFactory();
    HeadFactory headFactory = new HeadFactory();

    private int x = 0;
    private final String[] robotName = {"Вася", "Петя", "Маша", "Коля", "Степан", "Леонид", "Валера", "Даша", "Артур"};

    public void createRobot() {
        int i;
        int j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Параметры робота " + "по имени " + robotName[x] + ":");
                x++;
                System.out.println(createBody(i));
                System.out.println(createHead(j));
            }
        }
    }

    private BodyType createBody(int i) {
        return bodyFactory.createRobotPart(i);
    }

    private HeadType createHead(int j) {
        return headFactory.createRobotPart(j);
    }


}
