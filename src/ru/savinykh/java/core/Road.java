package ru.savinykh.java.core;

public class Road extends Barrier {

    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Дистанция длиной: " + this.length);
        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("успешно");

            return true;
        } else {
            System.out.println("не смог");

            return false;
        }
    }
}
