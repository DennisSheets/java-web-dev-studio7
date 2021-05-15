package org.launchcode.studio7;

public interface OpticalDrive {

     public void spin();
     public void list();

     public void write(String filename, int mb, String fileType);
     public void remove();
     public void wipe();
}
