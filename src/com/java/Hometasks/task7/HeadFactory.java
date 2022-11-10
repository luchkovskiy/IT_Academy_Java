package com.java.Hometasks.task7;

public class HeadFactory implements FactoryOperation {
    private HeadType head;

    @Override
    public void createRobotPart(int j) {
        switch (j) {
            case 0:
                head = HeadType.CIRCLE;
                break;
            case 1:
                head = HeadType.RECTANGLE;
                break;
            case 2:
                head = HeadType.TRIANGLE;
                break;
            default:
                System.out.println("Ошибка в HeadFactory");
        }
    }

    @Override
    public String toString() {
        return "Голова - " + head.getTitle() + "\n";
    }
}
