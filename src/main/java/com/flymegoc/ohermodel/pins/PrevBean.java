package com.flymegoc.ohermodel.pins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flymegoc.ohermodel.FileBean;
import com.flymegoc.ohermodel.TextMetaBean;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrevBean {
    /**
     * pin_id : 1098321285
     * user_id : 11993652
     * board_id : 15854996
     * file_id : 135908581
     * file : {"bucket":"hbimg","key":"e4d6a18f908e6334a9d972176a0e6312e15f9075ea5da-20hKD0","type":"image/png","height":"1047","width":"650","frames":"1"}
     * media_type : 0
     * source : null
     * link : null
     * raw_text :
     * text_meta : {}
     * via : 1096366534
     * via_user_id : 1152727
     * original : 1091102004
     * created_at : 1491934032
     * like_count : 0
     * comment_count : 0
     * repin_count : 0
     * is_private : 0
     * orig_source : null
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
}
