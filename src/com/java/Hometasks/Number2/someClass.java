package com.java.Hometasks.Number2;

public class someClass {
    public static int ex = 45;
    private static Integer exs = 450;

    public static void main(String[] args) {
        SpeedData newdata = new SpeedData();
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
        System.out.println("Value of byte variable is " + newdata.getX_1());
        System.out.println("Value of short variable is " + newdata.getX_2());
        System.out.println("Value of int variable is " + newdata.getX_3());
        System.out.println("Value of long variable is " + newdata.getX_4());
        System.out.println("Value of float variable is " + newdata.getX_5());
        System.out.println("Value of double variable is " + newdata.getX_6());
        System.out.println("Value of char variable is " + newdata.getX_7());
        System.out.println("Value of boolean variable is " + newdata.isItTrue());
        System.out.println("Value of Byte variable is " + newdata.getY_1());
        System.out.println("Value of Short variable is " + newdata.getY_2());
        System.out.println("Value of Integer variable is " + newdata.getY_3());
        System.out.println("Value of Long variable is " + newdata.getY_4());
        System.out.println("Value of Float variable is " + newdata.getY_5());
        System.out.println("Value of Double double is " + newdata.getY_6());
        System.out.println("Value of Character variable is " + newdata.getY_7());
        System.out.println("Value of Boolean variable is " + newdata.getItFalse());
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

    public static byte x_1 = 12;
    public static short x_2 = 10012;
    public static int x_3 = 2000012;
    public static long x_4 = 4000012l;
    public static float x_5 = 3.14f;
    public static double x_6 = 3.1414141414d;
    public static char x_7 = 'a';
    public static boolean isItTrue = true;

    public static Byte y_1 = 13;
    public static Short y_2 = 10013;
    public static Integer y_3 = 2000013;
    public static Long y_4 = 4000013l;
    public static Float y_5 = 3.15f;
    public static  Double y_6 = 3.15151515d;
    public static Character y_7 = 'b';
    public static Boolean isItFalse = false;

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

