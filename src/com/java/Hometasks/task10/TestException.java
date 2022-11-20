package com.java.Hometasks.task10;

import java.util.Random;

public class TestException {
    public Random random = new Random();

    public void createRandomValue() {

        int i;
        i = random.nextInt(150);
        i = i / useZero(i);
        try {
            checkException(i);
        } catch (MyException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Программа завершила работу");
        }
    }

    private int useZero(int i) {
        int someNull = random.nextInt(5) + 1;
        return someNull == 1 ? i : 1;
    }

    private void checkException(int i) throws MyException {
        if (i == 1) {
            throw new OneException("OneException - число равно 1");
        } else if (i > 100) {
            throw new OverOneHundredException("OverOneHundredException - число больше 100");
        } else if (i < 50) {
            throw new LessThanFiftyException("LessThanFifty Exception - число меньше 50");
        } else
            throw new MyException("MyException - число не подошло ни к одному обозначенному виду исключений");
    }
}

