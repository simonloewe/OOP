/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw04a01;

/**
 *
 * @author Lion
 */
public class Motor implements Switchable {

    int rpm;

    @Override
    public void switchOn() {
        if (isSwitchedOff()) {
            rpm = 1000;
        } else {
            isSwitchedOn();
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()) {
            rpm = 0;
        } else {
            isSwitchedOff();
        }
    }

    @Override
    public boolean isSwitchedOn() {
        if (rpm > 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isSwitchedOff() {
        if (rpm <= 0) {
            return true;
        } else {
            return false;
        }

    }
    
    public void statusAbfrage(){
        System.out.println(isSwitchedOn());
        System.out.println(isSwitchedOff());
        System.out.println(rpm);
    }

}