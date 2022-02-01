package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD(700,"Spider-man Soundtrack","CDROM");
        DVD dvd = new DVD(8000,"iron-man", "DVDROM");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        cd.writeData();
        cd.readWaveLength();
        dvd.readWaveLength();
        dvd.spinDisc();
        dvd.spinDisc();
    }
}
