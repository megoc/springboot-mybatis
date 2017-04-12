package com.flymegoc.model.huaban.pins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditBean {
    /**
     * porn : {"rate":0.8333254754543304,"label":0,"review":false}
     */

    private PornBean porn;

    public PornBean getPorn() {
        return porn;
    }

    public void setPorn(PornBean porn) {
        this.porn = porn;
    }
}
