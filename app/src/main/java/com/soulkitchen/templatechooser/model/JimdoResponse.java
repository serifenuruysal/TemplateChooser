
package com.soulkitchen.templatechooser.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JimdoResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("api_version")
    @Expose
    private Integer apiVersion;
    @SerializedName("uploaded_with")
    @Expose
    private String uploadedWith;
    @SerializedName("features")
    @Expose
    private List<String> features = null;
    @SerializedName("html_file")
    @Expose
    private String htmlFile;
    @SerializedName("pre_rendered_less_file")
    @Expose
    private String preRenderedLessFile;
    @SerializedName("less_file")
    @Expose
    private String lessFile;
    @SerializedName("manifest_file")
    @Expose
    private String manifestFile;
    @SerializedName("kickstarter_file")
    @Expose
    private String kickstarterFile;
    @SerializedName("preview")
    @Expose
    private String preview;
    @SerializedName("screenshots")
    @Expose
    private Screenshots screenshots;
    @SerializedName("css_files")
    @Expose
    private List<String> cssFiles = null;
    @SerializedName("js_files")
    @Expose
    private List<Object> jsFiles = null;
    @SerializedName("image_files")
    @Expose
    private List<Object> imageFiles = null;
    @SerializedName("variations")
    @Expose
    private List<Variation> variations = null;

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

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Integer apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getUploadedWith() {
        return uploadedWith;
    }

    public void setUploadedWith(String uploadedWith) {
        this.uploadedWith = uploadedWith;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public String getHtmlFile() {
        return htmlFile;
    }

    public void setHtmlFile(String htmlFile) {
        this.htmlFile = htmlFile;
    }

    public String getPreRenderedLessFile() {
        return preRenderedLessFile;
    }

    public void setPreRenderedLessFile(String preRenderedLessFile) {
        this.preRenderedLessFile = preRenderedLessFile;
    }

    public String getLessFile() {
        return lessFile;
    }

    public void setLessFile(String lessFile) {
        this.lessFile = lessFile;
    }

    public String getManifestFile() {
        return manifestFile;
    }

    public void setManifestFile(String manifestFile) {
        this.manifestFile = manifestFile;
    }

    public String getKickstarterFile() {
        return kickstarterFile;
    }

    public void setKickstarterFile(String kickstarterFile) {
        this.kickstarterFile = kickstarterFile;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public Screenshots getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(Screenshots screenshots) {
        this.screenshots = screenshots;
    }

    public List<String> getCssFiles() {
        return cssFiles;
    }

    public void setCssFiles(List<String> cssFiles) {
        this.cssFiles = cssFiles;
    }

    public List<Object> getJsFiles() {
        return jsFiles;
    }

    public void setJsFiles(List<Object> jsFiles) {
        this.jsFiles = jsFiles;
    }

    public List<Object> getImageFiles() {
        return imageFiles;
    }

    public void setImageFiles(List<Object> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public List<Variation> getVariations() {
        return variations;
    }

    public void setVariations(List<Variation> variations) {
        this.variations = variations;
    }

}
