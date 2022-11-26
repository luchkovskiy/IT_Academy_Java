package com.java.Hometasks.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Menu {
    private Product product = new Product();
    private Order order = new Order();

    public void start() {
        Path greetingsPath = Path.of("resources", "Greetings.txt");
        try {
            Files.lines(greetingsPath).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        action();
    }

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int mainAction;
        Path actionPath = Path.of("resources", "Data", "Actions.txt");
        try {
            Files.lines(actionPath).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Выберите действие: ");
        mainAction = scanner.nextInt();
        checkFoolValue(mainAction);
        chooseAction(mainAction);
    }


    private void checkFoolValue(int mainAction) {
        if (mainAction < 0 || mainAction > 6) {
            System.err.println("Вы ввели недействительное число, аккуратнее: программа и так на соплях :) \n");
            action();
        }
    }

    private void chooseAction(int mainAction) {
        switch (mainAction) {
            case 0 -> exitProgram();
            case 1 -> {
                product.create();
                action();
            }
            case 2 -> {
                product.delete();
                action();
            }
            case 3 -> {
                product.print();
                action();
            }
            case 4 -> {
                order.create();
                action();
            }
            case 5 -> {
                order.delete();
                action();
            }
            case 6 -> {
                order.print();
                action();
            }
        }
    }

    private void exitProgram() {
        System.out.println("До свидания! :)");
        System.exit(0);
    }
}
