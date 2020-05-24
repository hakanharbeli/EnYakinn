package com.harbeli.enyakin;

public class BankaSecViewItem {
    private String TagText;
    private String İmageName;

    public BankaSecViewItem(String tagText, String imageName) {
        TagText = tagText;
        İmageName = imageName;
    }

    public String getTagText() {
        return TagText;
    }

    public void setTagText(String tagText) {
        TagText = tagText;
    }

    public String getImageName() {
        return İmageName;
    }

    public void setImageName(String imageName) {
        İmageName = imageName;
    }
}
