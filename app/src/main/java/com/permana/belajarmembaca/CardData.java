package com.permana.belajarmembaca;

public class CardData {

    private int imageId;
    private int stringId;

    public CardData(int imageId, int stringId) {
        this.imageId = imageId;
        this.stringId = stringId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getStringId() {
        return stringId;
    }

    public void setStringId(int stringId) {
        this.stringId = stringId;
    }
}
