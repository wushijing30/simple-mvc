package org.wusj.simple.framework.helper;

import org.wusj.simple.framework.Utils.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Bean助手类
 * 它相当于一个“Bean容器”，存放了Bean类与Bean实例的映射关系
 * Created by wusj on 2017/10/8.
 */
public class BeanHelper {

    /**
     * 定义Bean映射
     */
    private static final Map<Class<?>, Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for (Class<?> cls : beanClassSet) {
            Object obj = ReflectionUtil.newInstance(cls);
            BEAN_MAP.put(cls, obj);
        }
    }

    /***
     * 获取Bean映射
     */
    public static Map<Class<?>, Object> getBeanMap() {
        return BEAN_MAP;
    }

    /**
     * 获取Bean实例
     */
    public static <T> T getBean(Class<T> cls) {
        if (!BEAN_MAP.containsKey(cls)) {
            {
                throw new RuntimeException("can not get Bean by class: " + cls);
            }
        }
        return (T) BEAN_MAP.get(cls);
    }

}
