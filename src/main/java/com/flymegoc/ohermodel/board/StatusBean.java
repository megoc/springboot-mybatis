package com.flymegoc.ohermodel.board;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusBean {
    /**
     * newbietask : 0
     * lr : 1462205072
     * invites : 0
     * share : 0
     * default_board : 19513481
     * old_tags : 1
     */

    private int newbietask;
    private int lr;
    private int invites;
    private String share;
    private int default_board;
    private int old_tags;

    public int getNewbietask() {
        return newbietask;
    }

    public void setNewbietask(int newbietask) {
        this.newbietask = newbietask;
    }

    public int getLr() {
        return lr;
    }

    public void setLr(int lr) {
        this.lr = lr;
    }

    public int getInvites() {
        return invites;
    }

    public void setInvites(int invites) {
        this.invites = invites;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public int getDefault_board() {
        return default_board;
    }

    public void setDefault_board(int default_board) {
        this.default_board = default_board;
    }

    public int getOld_tags() {
        return old_tags;
    }

    public void setOld_tags(int old_tags) {
        this.old_tags = old_tags;
    }
}
