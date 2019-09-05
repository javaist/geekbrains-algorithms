package ru.xsd.javaist.algorithms;


public interface Array<E> {

    void add(E value);

    default void addAll(E...values) {
        for (E value : values) {
            add(value);
        }
    };

    boolean remove(E value);
    boolean remove(int index);

    E get(int index);

    boolean contains(E value);
    int indexOf(E value);

    int size();
    boolean isEmpty();

    void sortBubble();
    void sortSelect();
    void sortInsert();

//        1. Создать массив большого размера (миллион элементов).
//        2. Написать методы удаления, добавления, поиска элемента массива.
//        3. Заполнить массив случайными числами.
//        4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
    }