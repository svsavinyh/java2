package ru.savinykh.java.core;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human(distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot(distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat(distance, heigth);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Road("Дистанция " + i, distance);
            } else {
                barriers[i] = new Wall("Стена высотой " + i, distance);
            }
        }

        for (Actions action : actions) {
            boolean result = true;
            for (Barrier barrier : barriers) {
                result = barrier.moving(action);
                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("Испытание пройдено");
            } else {
                System.out.println("Выбыл");
            }
        }
    }
}
