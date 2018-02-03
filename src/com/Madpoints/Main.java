package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        ITelephone madPhone;
        madPhone = new DeskPhone(5551234);
        madPhone.powerOn();
        madPhone.callPhone(5551234);
        madPhone.answer();

        ITelephone madCell;
        madCell = new MobilePhone(5551234);
        madCell.powerOn();
        madCell.callPhone(5551234);
        madCell.answer();
        madCell.powerOn();
        madCell.callPhone(5551234);
    }
}
