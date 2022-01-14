package io.sharma.akash.ioc;

public class Airtel implements Sim{

    public Airtel() {
        System.out.println("constructing Airtel");
    }

    @Override
    public void calling() {
        System.out.println("call using Airtel");
    }

    @Override
    public void data() {
        System.out.println("browse data using Airtel");
    }
}
