package org.launchcode.studio7;

public class DVD extends  BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    public DVD(int storageCompacity, String name, String discType) {
        super(storageCompacity, name, discType);
    }

    @Override
    public void readWaveLength() {
        System.out.println("650 nano meters");
    }

    @Override
    public void writeData() {
        System.out.println("read mechanism :10.5 mb/s");
    }

    @Override
    public void spinDisc() {
        System.out.println("cd spinning at 400 rmp");

    }
// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
