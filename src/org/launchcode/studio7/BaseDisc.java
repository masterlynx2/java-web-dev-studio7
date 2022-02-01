package org.launchcode.studio7;

public abstract class BaseDisc {

    private int storageCompacity;
    private String name;
    private String discType;


    public abstract void readWaveLength();
    public abstract void writeData();

    public BaseDisc(int storageCompacity, String name, String discType) {
        this.storageCompacity = storageCompacity;
        this.name = name;
        this.discType = discType;

    }

    public int getStorageCompacity() {
        return storageCompacity;
    }

    public void setStorageCompacity(int storageCompacity) {
        this.storageCompacity = storageCompacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
