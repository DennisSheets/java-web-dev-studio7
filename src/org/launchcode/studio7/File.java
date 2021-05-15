package org.launchcode.studio7;

public class File {

    String title;
    int sizeMB;
    String fileType;
    private int fileID;
    private static int nextID = 1;

    public File() {
        fileID = nextID;
        nextID++;
    }
    public File(String title, int sizeMB, String fileType) {
        this();
        this.title = title;
        this.sizeMB = sizeMB;
        this.fileType = fileType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(int sizeMB) {
        this.sizeMB = sizeMB;
    }

}
