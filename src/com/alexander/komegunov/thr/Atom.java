package com.alexander.komegunov.thr;

public class Atom {

    public static void main( String[] args ) {

        Nucleo nucleo1 = new Nucleo("Sasha", 5,1);
        Nucleo nucleo2 = new Nucleo("Fedor", 5,10);
        Nucleo nucleo3 = new Nucleo("Misha", 5,100);

        nucleo1.start();
        nucleo2.start();
        nucleo3.start();
    }
}
