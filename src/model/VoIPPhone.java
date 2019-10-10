package model;

public class VoIPPhone implements Phone {

    @Override
    public void dial() {
        System.out.println("Connecting to internet connection and dialing number");

    }

    @Override
    public void hangUp() {
        System.out.println("Closing internet connection.");

    }
}
