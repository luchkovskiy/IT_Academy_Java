package com.java.Hometasks.Number3;

// 1 - red, 2 - orange, 3 - yellow, 4 - green, 5 - blue, 6 - indigo, 7 - violet, 0 - nothing

public class FirstClass {
    public static void main(String[] args) {
        int firstColor = 3;  // Именно в эти 2 переменные вписываются номера цветов, сверху порядок нумерации
        int secondColor = 0;
        Rainbow.printColor(firstColor, secondColor);
    }
}
class Rainbow {
    public static void printColor(int fColor, int sColor) {
        if (sColor == 0) {
            chooseColor(fColor);
        } else if (fColor == 0) {
            chooseColor(sColor);
        } else {
            chooseBothColor(fColor, sColor);
        }
    }
    private static void chooseColor(int getted) {
        switch (getted) {
            case 1:
                System.out.println("The color is red");
                break;
            case 2:
                System.out.println("The color is orange");
                break;
            case 3:
                System.out.println("The color is yellow");
                break;
            case 4:
                System.out.println("The color is green");
                break;
            case 5:
                System.out.println("The color is blue");
                break;
            case 6:
                System.out.println("The color is indigo");
                break;
            case 7:
                System.out.println("The color is violet");
                break;
            default:
                System.out.println("No color");
        }
    }

    private static void chooseBothColor(int colorFirst, int colorSecond) {
        String fAnswer;
        String sAnswer;
        fAnswer = FinalChoose(colorFirst);
        sAnswer = FinalChoose(colorSecond);
        System.out.println("The color is " + fAnswer + " and " + sAnswer);
    }

    private static String FinalChoose(int colorNumber) {
        String answer = "Smth";
        switch (colorNumber) {
            case 1:
                answer = "red";
                break;
            case 2:
                answer = "orange";
                break;
            case 3:
                answer = "yellow";
                break;
            case 4:
                answer = "green";
                break;
            case 5:
                answer = "blue";
                break;
            case 6:
                answer = "indigo";
                break;
            case 7:
                answer = "violet";
                break;
        }
        return answer;
    }
}



