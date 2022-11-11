package com.java.Hometasks.task7;

public class BodyFactory implements FactoryOperation {
    private BodyType body;

    @Override
    public BodyType createRobotPart(int i) {
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
        return body;
    }
}
