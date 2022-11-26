package com.java.Hometasks.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;


public class Order implements Actions {

    Scanner scanner = new Scanner(System.in);
    private String identifier;
    private List<String> productList = new ArrayList<>();
    private String orderDate;

    private final Path orderPath = Path.of("resources", "Data", "Order.txt");

    @Override
    public void create() {
        List<String> data = new ArrayList<>();
        setOrderData();
        data.add(getIdentifier());
        data.add(getOrderDate());
        try {
            Files.write(orderPath, data, StandardOpenOption.APPEND);
            Files.write(orderPath, getProductList(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Заказ успешно создан!");
    }

    @Override
    public void delete() {
        int i, j;
        List<String> lines;
        try {
            lines = Files.readAllLines(orderPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Введите номер заказа!");
        String founder = scanner.next();
        i = getFirstIndex(lines, founder);
        j = getSecondIndex(lines, i);
        int counter = i;
        for (int firstIndex = i, secondIndex = j; counter < secondIndex; counter++) {
            lines.remove(firstIndex);
        }
        try {
            Files.write(orderPath, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Заказ успешно удален!");
    }

    @Override
    public void print() {
        try {
            Files.lines(orderPath).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> lines;
        try {
            lines = Files.readAllLines(orderPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        isOrderEmpty(lines);
    }

    public String getIdentifier() {
        return "Номер заказа: " + identifier;
    }

    public void setIdentifier() {
        identifier = null;
        System.out.println("Введите индетификационный номер заказа!");
        this.identifier = scanner.next();
        checkValueMatch(identifier);
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList() {
        productList.clear();
        fillProductList(this.productList);
    }

    public String getOrderDate() {
        return "Дата оформления заказа: " + orderDate;
    }

    public void setOrderDate() {
        System.out.println("Введите дату оформления заказа! \n" +
                "Введите 0, чтобы установить текущую дату (удобно)");
        this.orderDate = scanner.next();
        if (Integer.parseInt(orderDate) == 0) {
            Calendar calendar = Calendar.getInstance();
            orderDate = calendar.getTime().toString();
        }
    }

    private void fillProductList(List<String> productList) {
        int i = 0;
        Path productPath = Path.of("resources", "Data", "Product.txt");
        List<String> products;
        try {
            products = Files.readAllLines(productPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Чтобы заказать товар - введите его номер\n" +
                "Введите -1, если вы закончили оформлять заказ");
        int action = scanner.nextInt();
        if (action == -1) {
            System.out.println("Ваш заказ успешно создан!");
            return;
        }
        int j = getLineIndex(i, products, action);
        productList.add(products.get(j + 1));
        System.out.println("Вы добавили товар к заказу!");
        fillProductList(productList);

    }

    private int getLineIndex(int i, List<String> products, int action) {
        Menu menu = new Menu();
        for (String line : products) {
            if (line.endsWith(String.valueOf(action))) {
                break;
            }
            i++;
        }
        if (i == products.size()) {
            System.err.println("Товары с таким идентификационным номером не найдены!");
            menu.action();
        }
        return i;
    }

    private void setOrderData() {
        setIdentifier();
        setOrderDate();
        setProductList();
    }

    private void isOrderEmpty(List<String> file) {
        int counter = 0;
        for (String s : file) {
            if (s.isEmpty())
                counter++;
        }
        if (counter == file.size())
            System.out.println("Заказы не найдены!\n");
    }

    private int getFirstIndex(List<String> lines, String founder) {
        Menu menu = new Menu();
        int i = 0;
        for (String line : lines) {
            if (line.endsWith(founder)) {
                return i;
            }
            i++;
        }
        if (i == lines.size()) {
            System.err.println("Заказ с таким номером не найден!");
            menu.action();
        }
        return i;
    }

    private int getSecondIndex(List<String> lines, int i) {
        int j = i + 1;
        for (int index = i + 1; index < lines.size(); index++) {
            if (lines.get(index).startsWith("Номер")) {
                return j;
            }
            j++;
        }
        return j;
    }

    private void checkValueMatch(String identifier) {
        Menu menu = new Menu();
        List<String> orderLines;
        try {
            orderLines = Files.readAllLines(orderPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String s : orderLines) {
            if (s.endsWith(identifier)) {
                System.err.println("Заказ с таким номером уже существует!");
                menu.action();
            }
        }
    }
}
