package org.launchcode.studio7;

//import org.launchcode.studio7.*;

public class Main {

    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

       CD disc1 = new CD("Phantom of the Opera",700);
       CD disc2 = new CD("Home Movie Clips",8500);
       CD disc3 = new CD("Archived images", 700);
       CD disc4 = new CD("favorite music",700);
       CD disc5 = new CD("BU files", 700);

       File file1 = new File("Outgoing letter",30,"text");
       File file2 = new File("Lily 2019 Graduation", 4, "jpg");
       File file3 = new File("Phantom of the Opera", 35,"mp3");
       File file4 = new File("Lance learning to swim", 125,"mp4");
       File file5 = new File("Hungarian Rhapsody - Litsz", 35,"mp3");

       disc1.contents.add(file1);
       disc1.setCapacityUsed(disc1.getCapacityUsed() + file1.getSizeMB());
       disc1.setCapacityAvail(disc1.getCapacityAvail() - file1.getSizeMB());

       disc2.contents.add(file2);
       disc2.setCapacityUsed(disc2.capacityUsed + file2.getSizeMB());
       disc2.setCapacityAvail(disc2.capacityAvail - file2.getSizeMB());

       disc3.contents.add(file3);
       disc3.setCapacityUsed(disc3.capacityUsed + file3.getSizeMB());
       disc3.setCapacityAvail(disc3.capacityAvail - file3.getSizeMB());

       disc4.contents.add(file4);
       disc4.setCapacityUsed(disc4.capacityUsed + file4.getSizeMB());
       disc4.setCapacityAvail(disc4.capacityAvail - file4.getSizeMB());

       disc5.contents.add(file5);
       disc5.setCapacityUsed(disc5.capacityUsed + file5.getSizeMB());
       disc5.setCapacityAvail(disc5.capacityAvail - file5.getSizeMB());


      disc1.write("Vivaldi - Stupid good Recorder", 700,"mp3");


       disc1.remove();
       disc1.wipe();
       disc2.wipe();
    }
}


// TODO: Call each CD and DVD method to verify that they work as expected.
