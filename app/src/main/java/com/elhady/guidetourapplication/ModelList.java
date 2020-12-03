package com.elhady.guidetourapplication;


public class ModelList {
    private String name;
    private int imageID;
    private String description;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public ModelList(String name, int imageID, String description) {
        this.name = name;
        this.imageID = imageID;
        this.description = description;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
