package org.wusj.simple.framework.bean;

/**
 * 返回数据对象
 * Created by wusj on 2017/10/18.
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
