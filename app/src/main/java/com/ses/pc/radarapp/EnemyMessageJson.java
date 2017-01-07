package com.ses.pc.radarapp;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ses.pc.radarapp.Item;

public class EnemyMessageJson {

    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("etag")
    @Expose
    private String etag;

    /**
     * No args constructor for use in serialization
     *
     */
    public EnemyMessageJson() {
    }

    /**
     *
     * @param etag
     * @param items
     * @param kind
     */
    public EnemyMessageJson(List<Item> items, String kind, String etag) {
        super();
        this.items = items;
        this.kind = kind;
        this.etag = etag;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }



}
