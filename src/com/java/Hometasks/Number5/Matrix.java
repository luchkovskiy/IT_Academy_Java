package com.java.Hometasks.Number5;


import java.util.Arrays;

public class Matrix {
    public static int i;
    public static int j;

    public static void createMatrix() {
        String[][] matrix = new String[10][10];
        int counter = 0;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                if (counter % 3 == 0) {
                    matrix[i][j] = RandomValues.createRandomDouble();
                } else {
                    matrix[i][j] = RandomValues.createRandomString();
                }
                counter++;
            }
        }
        defineDiagonals(matrix);
        printMatrix(matrix);
    }

    public static void defineDiagonals(String[][] matrix) {
        String[] straightDiagonal = new String[10];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                if (j == i) {
                    straightDiagonal[i] = matrix[i][j];
                }
            }
        }
        String[] secondaryDiagonal = new String[10];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                if (i + j == 9) {
                    secondaryDiagonal[i] = matrix[i][j];
                }
            }
        }
        areDiagonalsEqual(straightDiagonal, secondaryDiagonal);
        connectStringArrays(straightDiagonal, secondaryDiagonal);
    }

    public static void areDiagonalsEqual(String[] firstDiagonal, String[] secondDiagonal) { // Переделать
        for (i = 0; i < firstDiagonal.length; i++) {
            if (firstDiagonal[i].equals(secondDiagonal[i])) {
                System.out.println(firstDiagonal[i] + " " + secondDiagonal[i] + "\n" + i + " value of straight and secondary diagonal are equal ");
            } else {
                System.out.println("1 step:\n" + "Straight and secondary diagonals are not equal");
                break;
            }

        }
    }

    public static void connectStringArrays(String[] firstArray, String[] secondArray) {
        String[] newArray = new String[firstArray.length + secondArray.length];
        int arrayCounter = 0;
        for (i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
            arrayCounter++;
        }
        for (j = 0; j < secondArray.length; j++) {
            newArray[arrayCounter++] = secondArray[j];
        }
        valueDistribution(newArray);
    }

    public static void valueDistribution(String[] valueArray) {
        double[] currentDoubleArray = new double[20];
        String[] currentStringArray = new String[20];
        int doubleCounter = 0;
        int stringCounter = 0;
        for (i = 0; i < valueArray.length; i++) {
            char firstChar = valueArray[i].toCharArray()[0];
            if (Character.isDigit(firstChar)) {
                currentDoubleArray[doubleCounter] = Double.parseDouble(valueArray[i]);
                doubleCounter++;
            } else {
                currentStringArray[stringCounter] = String.valueOf(valueArray[i]);
                stringCounter++;
            }
        }
        double[] doubleArray = Arrays.copyOf(currentDoubleArray, doubleCounter);
        String[] stringArray = Arrays.copyOf(currentStringArray, stringCounter);
        workWithDoubleArray(doubleArray);
        workWithStringArray(stringArray);

    }

    public static void workWithDoubleArray(double[] doubleArray) {
        System.out.println("2 step:\n" + "Values of double array:");
        for (i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] >= 1.7) {
                doubleArray[i] = Math.ceil(doubleArray[i]);
            } else {
                doubleArray[i] = Math.floor(doubleArray[i]);
            }
            if (i == doubleArray.length - 1) {
                System.out.print(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + " _ ");
            }
        }
    }

    public static void workWithStringArray(String[] stringArray) {
        System.out.println("\n3 step:" + "\nValues of string array:");
        for (i = 0; i < stringArray.length; i++) {
            StringBuilder str = new StringBuilder(stringArray[i].substring(2, 5));
            if (i == stringArray.length - 1) {
                System.out.print(str + "\n");
            } else {
                System.out.print(str + ", ");
            }
        }
    }

    public static void printMatrix(String[][] matrix) {
        System.out.println("4 step:\n" + "Matrix values:");
        for (j = 0; j < matrix[0].length; j++) {
            for (i = 0; i < matrix.length; i++) {
                if (i == matrix.length - 1) {
                    System.out.print(matrix[i][j] + "\n");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}


