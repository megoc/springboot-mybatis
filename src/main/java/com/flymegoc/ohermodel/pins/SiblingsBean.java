package com.flymegoc.ohermodel.pins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flymegoc.ohermodel.FileBean;
import com.flymegoc.ohermodel.TextMetaBean;
import com.flymegoc.ohermodel.UserBean;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiblingsBean {
    /**
     * pin_id : 1098326726
     * user_id : 6938531
     * board_id : 28571934
     * file_id : 73888896
     * file : {"id":73888896,"farm":"farm1","bucket":"hbimg","key":"e07517db0856aed6b9a5016d003046e243dedb7cacf8d-uzF4Lr","type":"image/png","width":580,"height":883,"frames":1}
     * media_type : 0
     * source : tieba.baidu.com
     * link : http://tieba.baidu.com/p/3773583964
     * raw_text :
     * text_meta : {}
     * via : 1098325546
     * via_user_id : 11963974
     * original : 384873259
     * created_at : 1491935935
     * like_count : 0
     * comment_count : 0
     * repin_count : 0
     * is_private : 0
     * orig_source : null
     * user : {"user_id":6938531,"username":"黑图腾2012","urlname":"n2mm2icds9r","created_at":1363937062,"avatar":{"id":94826698,"farm":"farm1","bucket":"hbimg","key":"450ea03c3e122722116c1ec0cd564bf0a11dd9856940f-Hcb8ad","type":"image/jpeg","height":"3508","frames":"1","width":"2480"},"extra":null}
     * board : {"board_id":28571934,"user_id":6938531,"title":"女人素材","description":"","category_id":"illustration","seq":21,"pin_count":8924,"follow_count":483,"like_count":13,"created_at":1457881158,"updated_at":1491935959,"deleting":0,"is_private":0,"extra":null}
     * via_user : {"user_id":11963974,"username":"奔跑蜗牛画室","urlname":"qnjkrli2ab","created_at":1391749153,"avatar":{"id":38099450,"farm":"farm1","bucket":"hbimg","key":"0054bc07dade265a3da87af097cceee4be523bfb6eb-dRzHz0","type":"image/jpeg","width":50,"height":50,"frames":1},"extra":null}
     */

    private int pin_id;
    private int user_id;
    private int board_id;
    private int file_id;
    private FileBean file;
    private int media_type;
    private String source;
    private String link;
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
    private UserBean user;
    private BoardBean board;
    private ViaUserBean via_user;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
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

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public BoardBean getBoard() {
        return board;
    }

    public void setBoard(BoardBean board) {
        this.board = board;
    }

    public ViaUserBean getVia_user() {
        return via_user;
    }

    public void setVia_user(ViaUserBean via_user) {
        this.via_user = via_user;
    }
}
