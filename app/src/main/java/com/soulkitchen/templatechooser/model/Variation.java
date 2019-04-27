
package com.soulkitchen.templatechooser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Variation {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon-type")
    @Expose
    private String iconType;
    @SerializedName("screenshots")
    @Expose
    private Screenshots_ screenshots;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconType() {
        return iconType;
    }

    public void setIconType(String iconType) {
        this.iconType = iconType;
    }

    public Screenshots_ getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(Screenshots_ screenshots) {
        this.screenshots = screenshots;
    }

}
