package model;

public class PhoneNumber {

    private Phone phone;

    public PhoneNumber(Phone phone) {
        this.phone = phone;
    }

    public void callNumber() {
        phone.dial();
    }

    public void endCall() {
        phone.hangUp();
    }
}
