package org.launchcode.studio7;

import java.util.Scanner;



public class CD extends Disc implements OpticalDrive{

    public final int rpmLow = 200;
    public final int rpmHigh = 500;
    private int  nextFileNameNumber = 1;


    public CD(String name, double capacity) {
        super(name, capacity);
    }


    @Override
    public void spin() {
        System.out.println("A CD spins at a rate of " + rpmLow + " - " + rpmHigh);
    }

    @Override
    public void list() {
        System.out.println("Title: " + name +
            "\nMax Capacity: " + capacity +
            "\nUsed Space: " + capacityUsed +
            "\nAvailable Space: " + capacityAvail +
            "\nContents: ");
            if(this.contents.size() <1){
                System.out.println("     This is an empty disc.");
            }
            for(File file : contents){
                System.out.println("     " + file.getTitle() + " : " + file.getSizeMB() + "mb");
        }
    }

    @Override
    public void write(String title, int sizeMB, String fileType) {

        if(this.getCapacityAvail() > sizeMB) {
            File nextFileName = new File(title, sizeMB, fileType);
            this.contents.add(nextFileName);
            this.setCapacityAvail(this.getCapacityAvail() - sizeMB);
            this.setCapacityUsed(this.getCapacityUsed() + sizeMB);
        } else {
            System.out.println("There isn't enough space to add your " + sizeMB + "mb file. " + name + " HAS NOT BEEN ADDED!");
        }
    }

    @Override
    public void remove() {
        System.out.println("\nEnter the number that corresponds to the file you want to remove from this disc.");
        Scanner input = new Scanner(System.in);
        for(File file : contents){
            int i = 0;
            System.out.println("     " + i + " : " + file.getTitle());
        }
        int indexOfToBeRemoved = input.nextInt();
        input.close();
        this.setCapacityUsed(this.getCapacityUsed() - contents.get(indexOfToBeRemoved).getSizeMB());
        this.setCapacityAvail(this.getCapacityAvail() + contents.get(indexOfToBeRemoved).getSizeMB());
        contents.remove(indexOfToBeRemoved);

        System.out.println("Here is the update content on this disk.\n");
        this.list();

    }

    @Override
    public void wipe() {

        if(this.contents.size() == 0){
            System.out.println("This disc is already empty.... silly monkey!");
        } else {
            Scanner input = new Scanner(System.in);

            System.out.println("\nIf you WIPE this disc, you will lose the following files!");
            for (File file : contents){
                System.out.println("     " + file.getTitle());
            }
            System.out.println("\nAre you sure that you want to WIPE this disk? Enter 'YES' to continue.");
            String answer1 = input.nextLine();
            if (answer1.equals("YES")) {
                System.out.println("Are you absolutely sure that you want to wipe this disc? Enter 'YESYES' to continue.");
                String answer2 = input.nextLine();
                if (answer2.equals("YESYES")) {
                    System.out.println("Are you double dog sure that you want to lose everything on this disc? Enter 'FUCKYES' to continue");
                    String answer3 = input.nextLine();
                    input.close();
                    if (answer3.equals("FUCKYES")) {
                        while (contents.size() > 0) {
                            System.out.println(contents.get(0).getTitle() + " ...... removed");
                            this.setCapacityUsed(this.getCapacityUsed() - contents.get(0).getSizeMB());
                            this.setCapacityAvail(this.getCapacityAvail() + contents.get(0).getSizeMB());
                            contents.remove(0);

                        }
                    }
                }
            }
        }
        System.out.println("\n");
        this.list();

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.



}
