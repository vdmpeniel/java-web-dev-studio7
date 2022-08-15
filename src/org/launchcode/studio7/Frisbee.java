package org.launchcode.studio7;

public class Frisbee extends BaseDisk{
    public Frisbee(int spinSpeed) {
        super(spinSpeed);
    }
    public void setRotationSpeed(int rotationSpeed){
        super.setRotationSpeed(rotationSpeed);
    }
    public void fly(){
        try {
            System.out.println("I am flying!!!");
            Thread.sleep(3000);
            System.out.println("OK, now I am not.  :P");
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
