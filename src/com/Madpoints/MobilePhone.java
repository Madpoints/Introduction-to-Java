package com.Madpoints;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        if (isOn) {
            System.out.println("Powering off");
            isOn = false;
        } else {
            System.out.println("Powering on");
            isOn = true;
        }
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + "on mobile phone");
        } else {
            System.out.println("Phone is off");
        }

    }

    @Override
    public void answer() {
        if (isOn) {
            if (isRinging) {
                System.out.println("Answering mobile phone");
                isRinging = false;
            }
        } else {
            System.out.println("Phone is off");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ring tone");
        } else {
            isRinging = false;
            System.out.println("Cannot call phone is off");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
