
package com.soulkitchen.templatechooser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Screenshots {

    @SerializedName("iphone")
    @Expose
    private String iphone;
    @SerializedName("ipad")
    @Expose
    private String ipad;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("preview")
    @Expose
    private String preview;

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getIpad() {
        return ipad;
    }

    public void setIpad(String ipad) {
        this.ipad = ipad;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

}
