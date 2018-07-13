package com.mock.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @author :  peng.liu
 * @description : json工具类
 * @date :    2018/7/13 15:08
 */
public class JsonUtil {

    /**
     * 对象转string
     * @param obj 对象
     * @return String
     */
    public static String toStr(Object obj) {
        return JSONObject.toJSONString(obj);
    }

}
