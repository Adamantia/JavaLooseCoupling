package main;

import model.Phone;
import model.PhoneNumber;
import model.VoIPPhone;

public class LooseLauncher {

    public static void main(String[] args) {

        Phone phone = new VoIPPhone();

        PhoneNumber phoneNumber = new PhoneNumber(phone);
        phoneNumber.callNumber();
        phoneNumber.endCall();

    }
}
