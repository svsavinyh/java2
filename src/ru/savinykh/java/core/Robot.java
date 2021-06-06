package ru.savinykh.java.core;

public class Robot implements Actions {
    private int runDistance;
    private int jumpHeight;

    public Robot(int distance, int jumpHeight) {
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Робот пробежал " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгнул на " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
