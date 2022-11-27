package com.java.Hometasks.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Product implements Actions {

    public Path productPath = Path.of("resources", "Data", "Product.txt");
    private final Scanner scanner = new Scanner(System.in);

    private String identify;

    private String productName;

    private String date;

    @Override
    public void create() {
        List<String> data = new ArrayList<>();
        setProductData();
        data.add(getIdentify());
        data.add(getProductName());
        data.add(getDate());
        try {
            Files.write(productPath, data, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Продукт успешно создан!\n");
    }

    @Override
    public void delete() {
        int i = 0;
        List<String> lines;
        try {
            lines = Files.readAllLines(productPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Введите идентификационный номер товара");
        String founder = scanner.nextLine();
        int j = getLineIndex(i, lines, founder);
        for (int x = 0, y = 3; x < y; x++) {
            lines.remove(j);
        }
        try {
            Files.write(productPath, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Продукт успешно удален!\n");
    }

    @Override
    public void print() {
        int counter = 0;
        try {
            Files.lines(productPath).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> file;
        try {
            file = Files.readAllLines(productPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        isProductEmpty(counter, file);
        System.out.println("\nДействие успешно выполнено!\n");
    }

    public String getIdentify() {
        return "Идентификационный номер товара: " + identify;
    }

    public String getProductName() {
        return "Наименование продукта: " + productName;
    }

    public String getDate() {
        return "Дата изготовления продукта: " + date;
    }

    private void isProductEmpty(int counter, List<String> file) {
        for (String s : file) {
            if (s.isEmpty())
                counter++;
        }
        if (counter == file.size())
            System.out.println("Товары не найдены!");
    }

    private void setIdentify() {
        System.out.println("Введите идентификационный номер продукта");
        this.identify = scanner.nextLine();
        checkValueMatch(identify);
    }

    private void setProductName() {
        System.out.println("Введите имя продукта");
        this.productName = scanner.nextLine();
    }

    private void setDate() {
        System.out.println("Введите дату изготовления продукта \n" +
                "Введите 0, что установить текущую дату (удобно)");
        this.date = scanner.nextLine();
        if (Integer.parseInt(date) == 0) {
            Calendar calendar = Calendar.getInstance();
            date = calendar.getTime().toString();
        }
    }

    private void setProductData() {
        setIdentify();
        setProductName();
        setDate();
    }

    private int getLineIndex(int i, List<String> lines, String founder) {
        Menu menu = new Menu();
        for (String line : lines) {
            if (line.endsWith(founder)) {
                break;
            }
            i++;
        }
        if (i == lines.size()) {
            System.err.println("Товары с таким идентификационным номером не найдены! \n");
            menu.action();
        }
        return i;
    }

    private void checkValueMatch(String identifier) {
        Menu menu = new Menu();
        List<String> orderLines;
        try {
            orderLines = Files.readAllLines(productPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String s : orderLines) {
            if (s.endsWith(identifier)) {
                System.err.println("Товар с таким номером уже существует!");
                menu.action();
            }
        }
    }
}
