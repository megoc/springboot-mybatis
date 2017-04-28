package com.flymegoc.ohermodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by flymegoc on 2017/4/11.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class ColorsBean {
    private int color;
    private double ratio;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
}
