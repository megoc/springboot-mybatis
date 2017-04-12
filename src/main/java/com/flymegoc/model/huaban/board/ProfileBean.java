package com.flymegoc.model.huaban.board;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileBean {
    /**
     * location : 长沙
     * sex : 1
     * birthday : 1996-10-03
     * job : 苦逼大学生一枚
     * url :
     * about :
     */

    private String location;
    private String sex;
    private String birthday;
    private String job;
    private String url;
    private String about;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
