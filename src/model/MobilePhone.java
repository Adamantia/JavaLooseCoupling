package model;

import java.sql.SQLOutput;

public class MobilePhone implements Phone {

    @Override
    public void dial() {
        System.out.println("Dialing number");
    }

    @Override
    public void hangUp() {
        System.out.println("Hanging up");

    }

}
