package com.company;

public class Main {
    public static void main(String[] args) {
        // Создать пустую очередь для хранения 10 элементов
        Queue q1 = new Queue(15);

        char name[] = {'T', 'o', 'm'};

        Queue q2 = new Queue(name);

        char ch;
        int i;

        // Поместить ряд символов в очередь q1

        for (i = 0; i < 15; i++)
            q1.put((char) ('A' + i));

        // Создать одну очередь на основе другой
        Queue q3 = new Queue(q1);

        // Показать очереди
        System.out.print("Содержание очереди q1: ");
        for (i = 0; i < 15; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержание очереди q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержание очереди q3: ");
        for (i = 0; i < 15; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
