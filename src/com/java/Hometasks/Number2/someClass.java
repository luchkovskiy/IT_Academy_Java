package com.java.Hometasks.Number2;

import org.w3c.dom.ls.LSOutput;

public class someClass {
    public static int ex = 45;
    private static Integer exs = 450;

    public static void main(String[] args) {
        SpeedData mycar = new SpeedData();
        mycar.setDistance_km(20.5f);
        mycar.setTime_hours(2.3f);
        System.out.println("Current speed is " + mycar.getDistance_km() / mycar.getTime_hours() + " km/h");
        // Первая часть программы, пытался сделать что-то осмысленное с применением геттеров и сеттеров + переменной экземпляра, строго не судите
        char uwu = 'x';
        Character unu = 'y';
        boolean xyz = true;
        Boolean abc = false;
        short jj = 12;
        exs = ex;
        System.out.println(ex);
        // Вторая часть программы
    }
}

class SpeedData {

    private float distance_km;
    private float time_hours;

    public float getDistance_km() {
        return distance_km;
    }

    public void setDistance_km(float distance_km) {
        this.distance_km = distance_km;
    }

    public float getTime_hours() {
        return time_hours;
    }

    public void setTime_hours(float time_hours) {
        this.time_hours = time_hours;
    }  //Первая часть программы

    byte x_1 = 12;
    short x_2 = 10012;
    int x_3 = 2000012;
    long x_4 = 4000012l;
    float x_5 = 3.14f;
    double x_6 = 3.1414141414d;
    char x_7 = 'a';
    boolean isItTrue = true;

    Byte y_1 = 13;
    Short y_2 = 10013;
    Integer y_3 = 2000013;
    Long y_4 = 4000013l;
    Float y_5 = 3.15f;
    Double y_6 = 3.15151515d;
    Character y_7 = 'b';
    Boolean isItFalse = false;

    public byte getX_1() {
        return x_1;
    }

    public void setX_1(byte x_1) {
        this.x_1 = x_1;
    }

    public short getX_2() {
        return x_2;
    }

    public void setX_2(short x_2) {
        this.x_2 = x_2;
    }

    public int getX_3() {
        return x_3;
    }

    public void setX_3(int x_3) {
        this.x_3 = x_3;
    }

    public long getX_4() {
        return x_4;
    }

    public void setX_4(long x_4) {
        this.x_4 = x_4;
    }

    public float getX_5() {
        return x_5;
    }

    public void setX_5(float x_5) {
        this.x_5 = x_5;
    }

    public double getX_6() {
        return x_6;
    }

    public void setX_6(double x_6) {
        this.x_6 = x_6;
    }

    public char getX_7() {
        return x_7;
    }

    public void setX_7(char x_7) {
        this.x_7 = x_7;
    }

    public boolean isItTrue() {
        return isItTrue;
    }

    public void setItTrue(boolean itTrue) {
        isItTrue = itTrue;
    }

    public Byte getY_1() {
        return y_1;
    }

    public void setY_1(Byte y_1) {
        this.y_1 = y_1;
    }

    public Short getY_2() {
        return y_2;
    }

    public void setY_2(Short y_2) {
        this.y_2 = y_2;
    }

    public Integer getY_3() {
        return y_3;
    }

    public void setY_3(Integer y_3) {
        this.y_3 = y_3;
    }

    public Long getY_4() {
        return y_4;
    }

    public void setY_4(Long y_4) {
        this.y_4 = y_4;
    }

    public Float getY_5() {
        return y_5;
    }

    public void setY_5(Float y_5) {
        this.y_5 = y_5;
    }

    public Double getY_6() {
        return y_6;
    }

    public void setY_6(Double y_6) {
        this.y_6 = y_6;
    }

    public Character getY_7() {
        return y_7;
    }

    public void setY_7(Character y_7) {
        this.y_7 = y_7;
    }

    public Boolean getItFalse() {
        return isItFalse;
    }

    public void setItFalse(Boolean itFalse) {
        isItFalse = itFalse;
    }      // Вторая часть программы

}

