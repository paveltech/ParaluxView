package com.example.android.paraluxview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by android on 12/28/2017.
 */

public class ImageItem {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("flickr_id")
    @Expose
    private String flickrId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url_c")
    @Expose
    private String urlC;
    @SerializedName("url_n")
    @Expose
    private String urlN;
    @SerializedName("url_l")
    @Expose
    private String urlL;
    @SerializedName("url_h")
    @Expose
    private String urlH;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlickrId() {
        return flickrId;
    }

    public void setFlickrId(String flickrId) {
        this.flickrId = flickrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlC() {
        return urlC;
    }

    public void setUrlC(String urlC) {
        this.urlC = urlC;
    }

    public String getUrlN() {
        return urlN;
    }

    public void setUrlN(String urlN) {
        this.urlN = urlN;
    }

    public String getUrlL() {
        return urlL;
    }

    public void setUrlL(String urlL) {
        this.urlL = urlL;
    }

    public String getUrlH() {
        return urlH;
    }

    public void setUrlH(String urlH) {
        this.urlH = urlH;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
