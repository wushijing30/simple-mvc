package org.wusj.simple.framework.Utils;

import org.junit.Test;
import org.wusj.simple.framework.helper.ConfigHelper;

import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;

/**
 * Created by wusj on 2017/10/7.
 */
public class ReflectionUtilTest {
    private static final String CLASSNAME = "org.wusj.simple.framework.helper.ConfigHelper";

    @Test
    public void newInstance() throws Exception {
        Class<?> cls = Class.forName(CLASSNAME);
        Object obj = ReflectionUtil.newInstance(cls);
        assertTrue("通过反射实例化ConfigHelper失败！", (obj instanceof ConfigHelper));
    }

    @Test
    public void invokeMethod() throws Exception {
        Class<?> cls = Class.forName(CLASSNAME);
        ConfigHelper obj = (ConfigHelper) ReflectionUtil.newInstance(cls);
        Method method = cls.getMethod("getAppBasePackage");
        Object result = ReflectionUtil.invokeMethod(obj, method);
        System.out.println("result: " + result.toString());
    }

    @Test
    public void setField() throws Exception {
    }

}