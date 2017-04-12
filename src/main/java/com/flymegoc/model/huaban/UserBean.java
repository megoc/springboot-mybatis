package com.flymegoc.model.huaban;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flymegoc.model.huaban.board.ProfileBean;
import com.flymegoc.model.huaban.board.StatusBean;

/**
 * Created by flymegoc on 2017/4/12.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserBean {
    /**
     * user_id : 13103452
     * username : New_Symbol
     * urlname : newsymbol
     * created_at : 1398171528
     * avatar : {"id":60527506,"farm":"farm1","bucket":"hbimg","key":"41396565e437dce855819d0f75b56a18e4dcbdf757b39-TpLrEY","type":"image/jpeg","width":640,"height":858,"frames":1}
     * extra : null
     * pin_count : 6996
     * follower_count : 1440
     * like_count : 6
     * board_count : 48
     * following_count : 48
     * boards_like_count : 4
     * commodity_count : 0
     * creations_count : 0
     * muse_board_count : 0
     * explore_following_count : 0
     * profile : {"location":"长沙","sex":"1","birthday":"1996-10-03","job":"苦逼大学生一枚","url":"","about":""}
     * status : {"newbietask":0,"lr":1462205072,"invites":0,"share":"0","default_board":19513481,"old_tags":1}
     */

    private int user_id;
    private String username;
    private String urlname;
    private int created_at;
    private AvatarBean avatar;
    private ExtraBean extra;
    private int pin_count;
    private int follower_count;
    private int like_count;
    private int board_count;
    private int following_count;
    private int boards_like_count;
    private int commodity_count;
    private int creations_count;
    private int muse_board_count;
    private int explore_following_count;
    private ProfileBean profile;
    private StatusBean status;

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

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public int getPin_count() {
        return pin_count;
    }

    public void setPin_count(int pin_count) {
        this.pin_count = pin_count;
    }

    public int getFollower_count() {
        return follower_count;
    }

    public void setFollower_count(int follower_count) {
        this.follower_count = follower_count;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getBoard_count() {
        return board_count;
    }

    public void setBoard_count(int board_count) {
        this.board_count = board_count;
    }

    public int getFollowing_count() {
        return following_count;
    }

    public void setFollowing_count(int following_count) {
        this.following_count = following_count;
    }

    public int getBoards_like_count() {
        return boards_like_count;
    }

    public void setBoards_like_count(int boards_like_count) {
        this.boards_like_count = boards_like_count;
    }

    public int getCommodity_count() {
        return commodity_count;
    }

    public void setCommodity_count(int commodity_count) {
        this.commodity_count = commodity_count;
    }

    public int getCreations_count() {
        return creations_count;
    }

    public void setCreations_count(int creations_count) {
        this.creations_count = creations_count;
    }

    public int getMuse_board_count() {
        return muse_board_count;
    }

    public void setMuse_board_count(int muse_board_count) {
        this.muse_board_count = muse_board_count;
    }

    public int getExplore_following_count() {
        return explore_following_count;
    }

    public void setExplore_following_count(int explore_following_count) {
        this.explore_following_count = explore_following_count;
    }

    public ProfileBean getProfile() {
        return profile;
    }

    public void setProfile(ProfileBean profile) {
        this.profile = profile;
    }

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }
}
