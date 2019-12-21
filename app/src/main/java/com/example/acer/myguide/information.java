package com.example.acer.myguide;

public class information {

    private int mImage;
    private String mName;
    private String mAddress;

    public information(String name, String address, int image) {
        this.mImage = image;
        this.mName = name;
        this.mAddress = address;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmImage() {
        return mImage;
    }

}
