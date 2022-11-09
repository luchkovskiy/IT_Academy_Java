package com.java.Hometasks.task7;

public class BodyFactory implements FactoryOperation {
    BodyType body;

    @Override
    public void createRobotPart(int i) {
        switch (i) {
            case 0:
                body = BodyType.OVAL;
                break;
            case 1:
                body = BodyType.CIRCLE;
                break;
            case 2:
                body = BodyType.CONE;
                break;
            default:
                System.out.println("Ошибка в BodyFactory");
        }
    }

    @Override
    public String toString() {
        return "Тело - " + body.getTitle();
    }
}
