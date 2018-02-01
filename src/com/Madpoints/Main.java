package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        ITelephone madPhone;
        madPhone = new DeskPhone(5551234);
        madPhone.powerOn();
        madPhone.callPhone(5551234);
        madPhone.answer();
    }
}
