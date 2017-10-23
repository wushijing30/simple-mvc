package org.wusj.simple.framework.bean;

import org.wusj.simple.framework.Utils.CastUtil;

import java.util.Map;

/**
 * 请求参数实体
 * Created by wusj on 2017/10/17.
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 获取所有字段信息
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }

    public String getString(String name) {
        return CastUtil.castString(get(name));
    }

    public double getDouble(String name) {
        return CastUtil.castDouble(get(name));
    }

    public long getLong(String name) {
        return CastUtil.castLong(get(name));
    }

    public int getInt(String name) {
        return CastUtil.castInt(get(name));
    }

    private Object get(String name) {
        return paramMap.get(name);
    }



}
