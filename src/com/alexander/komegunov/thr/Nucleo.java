package com.alexander.komegunov.thr;

public class Nucleo extends Thread {

    private final String name;
    private final int interval;
    private final int total;

    public Nucleo(String name, int interval, int total) {
        this.name = name;
        this.interval = interval;
        this.total = total;
    }

    public void run() {
        try {
            for (int i = 1; i <= total; i++) {
                print(i);
                Thread.sleep(1000 * interval);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print(int i) {
        System.out.println("Name: " + name + " " + i);
    }

}