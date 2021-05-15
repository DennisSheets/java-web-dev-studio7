package org.launchcode.studio7;

public class DVD extends Disc implements OpticalDrive{

    public final int rpmLow = 570;
    public final int rpmHigh = 1600;

    public DVD(String name, double capacity) {
        super(name, capacity);
    }

    @Override
    public void spin() {

    }

    @Override
    public void list() {
        System.out.println("Title: " + name +
                "\nMax Capacity: " + capacity +
                "\nUsed Space: " + capacityUsed +
                "\nAvailable Space: " + capacityAvail +
                "\nContents: ");
        for(File file : contents){
            System.out.println("     " + file.getTitle() + " : " + file.getSizeMB() + "mb");

        }

    }

    @Override
    public void write(String filename, int mb, String fileType) {

    }

    @Override
    public void remove() {

    }

    @Override
    public void wipe() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
