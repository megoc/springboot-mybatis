package com.flymegoc.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

/**花瓣service
 * Created by flymegoc on 2017/4/11.
 */
public interface HuaBanService {
    @GET()
    Call<ResponseBody> getHuaban(@Url String url);

    @GET("pins/{pinId}/")
    Call<ResponseBody> getPin(@Path("pinId") int pinId);

    @GET("boards/{boardId}/")
    Call<ResponseBody> getBoard(@Path("boardId") int boardId);
}
