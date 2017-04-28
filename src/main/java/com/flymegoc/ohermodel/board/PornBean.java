package com.flymegoc.ohermodel.board;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PornBean {
    /**
     * rate : 0.7357520163059235
     * label : 0
     * review : true
     */

    private double rate;
    private int label;
    private boolean review;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public boolean isReview() {
        return review;
    }

    public void setReview(boolean review) {
        this.review = review;
    }
}
