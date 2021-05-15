package org.launchcode.studio7;

import java.util.ArrayList;


public abstract class Disc {

    String name;
    double capacity;
    double capacityUsed;
    double capacityAvail;
    ArrayList<File>  contents = new ArrayList();



    public Disc(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
        this.capacityUsed = capacityUsed;
        this.capacityAvail = capacity;
        this.contents = contents;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(double capacityUsed) {
        this.capacityUsed = capacityUsed;
    }

    public double getCapacityAvail() {
        return capacityAvail;
    }

    public void setCapacityAvail(double capacityAvail) {
        this.capacityAvail = capacityAvail;
    }

    public ArrayList<File> getContents() {
        return contents;
    }

    public void setContents(ArrayList<File> contents) {
        this.contents = contents;
    }
}
