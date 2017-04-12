package com.flymegoc.model.huaban;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by flymegoc on 2017/4/11.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileBean {

    private int id;
    private String farm;
    private String bucket;
    private String key;
    private String type;
    private int height;
    private int width;
    private String frames;
    private String theme;
    private List<ColorsBean> colors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getFrames() {
        return frames;
    }

    public void setFrames(String frames) {
        this.frames = frames;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<ColorsBean> getColors() {
        return colors;
    }

    public void setColors(List<ColorsBean> colors) {
        this.colors = colors;
    }
}
