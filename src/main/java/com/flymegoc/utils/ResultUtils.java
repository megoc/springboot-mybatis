package com.flymegoc.utils;

/**
 * 返回结果封装
 * Created by flymegoc on 2017/4/28.
 */
public class ResultUtils {

    /**
     * 获取带数据成功的结果封装
     * @param object 数据
     * @return 封装结果
     */
    public static BaseResult getSuccBaseResult(Object object) {
        BaseResult baseResult = new BaseResult();
        baseResult.code = 200;
        baseResult.message = "成功";
        baseResult.data = object;
        return baseResult;
    }

    /**
     * 不带数据的成功结果封装
     * @return 封装结果
     */
    public static BaseResult getSuccBaseResult() {

        return getSuccBaseResult(null);
    }

    /**
     * 失败结果封装
     * @param code 失败码
     * @param message 失败信息
     * @return 失败结果封装
     */
    public static BaseResult getErrorBaseResult(int code, String message) {
        BaseResult baseResult = new BaseResult();
        baseResult.code = code;
        baseResult.message = message;
        baseResult.data = null;
        return baseResult;
    }
}
