package com.flymegoc.ohermodel.pins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flymegoc.ohermodel.AvatarBean;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ViaUserBean {
    /**
     * user_id : 16883668
     * username : 窈窕如树
     * urlname : sp8ryv6hg9
     * created_at : 1424920110
     * avatar : {"id":68804853,"farm":"farm1","bucket":"hbimg","key":"0c2f04ca6a67954bd28306b37ee47297aa8e6cd2dc34-FxhSxa","type":"image/jpeg","width":600,"height":486,"frames":1}
     * extra : null
     */

    private int user_id;
    private String username;
    private String urlname;
    private int created_at;
    private AvatarBean avatar;
    private Object extra;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    public int getCreated_at() {
        return created_at;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public AvatarBean getAvatar() {
        return avatar;
    }

    public void setAvatar(AvatarBean avatar) {
        this.avatar = avatar;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }
}
