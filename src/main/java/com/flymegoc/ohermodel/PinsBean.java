package com.flymegoc.ohermodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PinsBean {
    /**
     * pin_id : 1098300672
     * user_id : 13103452
     * board_id : 16115516
     * file_id : 132102720
     * file : {"id":132102720,"farm":"farm1","bucket":"hbimg","key":"58c18d668aa22e9d86e095a946237bba06831182adff-JxIkdk","type":"image/jpeg","width":"522","height":"973","frames":"1","colors":[{"color":3815994,"ratio":0.18},{"color":12895428,"ratio":0.11}],"audit":{"porn":{"rate":0.7357520163059235,"label":0,"review":true}},"theme":"3a3a3a"}
     * media_type : 0
     * source : null
     * link : null
     * raw_text :
     * text_meta : {}
     * via : 1098242769
     * via_user_id : 13312690
     * original : 1047395805
     * created_at : 1491929077
     * like_count : 1
     * comment_count : 0
     * repin_count : 4
     * is_private : 0
     * orig_source : null
     * hide_origin : true
     */

    private int pin_id;
    private int user_id;
    private int board_id;
    private int file_id;
    private FileBean file;
    private int media_type;
    private Object source;
    private Object link;
    private String raw_text;
    private TextMetaBean text_meta;
    private int via;
    private int via_user_id;
    private int original;
    private int created_at;
    private int like_count;
    private int comment_count;
    private int repin_count;
    private int is_private;
    private Object orig_source;
    private boolean hide_origin;

    public int getPin_id() {
        return pin_id;
    }

    public void setPin_id(int pin_id) {
        this.pin_id = pin_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public int getFile_id() {
        return file_id;
    }

    public void setFile_id(int file_id) {
        this.file_id = file_id;
    }

    public FileBean getFile() {
        return file;
    }

    public void setFile(FileBean file) {
        this.file = file;
    }

    public int getMedia_type() {
        return media_type;
    }

    public void setMedia_type(int media_type) {
        this.media_type = media_type;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getLink() {
        return link;
    }

    public void setLink(Object link) {
        this.link = link;
    }

    public String getRaw_text() {
        return raw_text;
    }

    public void setRaw_text(String raw_text) {
        this.raw_text = raw_text;
    }

    public TextMetaBean getText_meta() {
        return text_meta;
    }

    public void setText_meta(TextMetaBean text_meta) {
        this.text_meta = text_meta;
    }

    public int getVia() {
        return via;
    }

    public void setVia(int via) {
        this.via = via;
    }

    public int getVia_user_id() {
        return via_user_id;
    }

    public void setVia_user_id(int via_user_id) {
        this.via_user_id = via_user_id;
    }

    public int getOriginal() {
        return original;
    }

    public void setOriginal(int original) {
        this.original = original;
    }

    public int getCreated_at() {
        return created_at;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public int getRepin_count() {
        return repin_count;
    }

    public void setRepin_count(int repin_count) {
        this.repin_count = repin_count;
    }

    public int getIs_private() {
        return is_private;
    }

    public void setIs_private(int is_private) {
        this.is_private = is_private;
    }

    public Object getOrig_source() {
        return orig_source;
    }

    public void setOrig_source(Object orig_source) {
        this.orig_source = orig_source;
    }

    public boolean isHide_origin() {
        return hide_origin;
    }

    public void setHide_origin(boolean hide_origin) {
        this.hide_origin = hide_origin;
    }
}
