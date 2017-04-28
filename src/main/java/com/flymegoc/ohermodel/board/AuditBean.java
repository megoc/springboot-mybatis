package com.flymegoc.ohermodel.board;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditBean {
    /**
     * porn : {"rate":0.7357520163059235,"label":0,"review":true}
     */

    private PornBean porn;

    public PornBean getPorn() {
        return porn;
    }

    public void setPorn(PornBean porn) {
        this.porn = porn;
    }
}
