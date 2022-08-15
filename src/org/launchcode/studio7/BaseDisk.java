package org.launchcode.studio7;

public abstract class BaseDisk implements Spinable{
    private int rotationSpeed;
    private final String type = this.getClass().getSimpleName().toUpperCase();

    public BaseDisk(int rotationSpeed){
        this.rotationSpeed = rotationSpeed;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    protected void setRotationSpeed(int rotationSpeed){
        this.rotationSpeed = rotationSpeed;
    }

    public String getType(){
        return type;
    }

    @Override
    public void spin() {
        System.out.println(String.format("Disk type: %s.", type));
        System.out.println(String.format("Spinning at %d RPM", rotationSpeed));
    }
}
