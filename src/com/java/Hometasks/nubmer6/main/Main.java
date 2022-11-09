package com.java.Hometasks.nubmer6.main;

import com.java.Hometasks.nubmer6.port.Port;

/**
 * Как работает эта программа:
 * Создается случайная плотность воды -> Создается случайный тип контейнера и его высота ->
 * -> Определяется, маленький ли контейнер или большой -> Рассчитывается объем контейнера ->
 * -> Определяется тип размещения контейнеров на палубе и тип палубы ( если палуба двойная - тип размещения определяется 2 раза) ->
 * -> Рассчитывается общее число воды на корабле (в м. кубических) -> Создаются 10 кораблей, которые прибывают в порт ->
 * -> После прибытия корабль может остаться в порту, а может и уехать -> Количество воды оставшихся кораблей - одно значение, а на всех кораблях за день - другое ->
 * -> Результаты выводятся на экран
 */
public class Main {
    public static void main(String[] args) {
        Port port = new Port();
        port.startThePort();
    }
}