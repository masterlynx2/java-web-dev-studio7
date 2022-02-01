package org.launchcode.studio7;

public class CD extends BaseDisc implements  OpticalDisc{

    // TODO: Implement your custom interface.

    public CD(int storageCompacity, String name, String discType) {
        super(storageCompacity, name, discType);
    }
    @Override
    public void readWaveLength() {
        System.out.println("780 nano meters");
    }

    @Override
    public void writeData() {
        System.out.println("read mechanism :1200 Kib/s");
    }

    @Override
    public void spinDisc() {
        System.out.println("cd spinning at 400 rmp");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
