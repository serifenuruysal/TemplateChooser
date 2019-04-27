
package com.soulkitchen.templatechooser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("ownbg.allowed")
    @Expose
    private String ownbgAllowed;
    @SerializedName("styles.disabled")
    @Expose
    private String stylesDisabled;
    @SerializedName("viewport")
    @Expose
    private String viewport;
    @SerializedName("responsive")
    @Expose
    private String responsive;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwnbgAllowed() {
        return ownbgAllowed;
    }

    public void setOwnbgAllowed(String ownbgAllowed) {
        this.ownbgAllowed = ownbgAllowed;
    }

    public String getStylesDisabled() {
        return stylesDisabled;
    }

    public void setStylesDisabled(String stylesDisabled) {
        this.stylesDisabled = stylesDisabled;
    }

    public String getViewport() {
        return viewport;
    }

    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    public String getResponsive() {
        return responsive;
    }

    public void setResponsive(String responsive) {
        this.responsive = responsive;
    }

}
