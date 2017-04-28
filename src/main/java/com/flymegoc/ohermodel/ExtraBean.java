package com.flymegoc.ohermodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flymegoc.ohermodel.pins.CoverBean;

/**
 * Created by flymegoc on 2017/4/11.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtraBean {
    private boolean is_museuser;
    /**
     * cover : {"pin_id":"236712675"}
     */

    private CoverBean cover;

    public CoverBean getCover() {
        return cover;
    }

    public void setCover(CoverBean cover) {
        this.cover = cover;
    }
    public boolean isIs_museuser() {
        return is_museuser;
    }

    public void setIs_museuser(boolean is_museuser) {
        this.is_museuser = is_museuser;
    }
}
