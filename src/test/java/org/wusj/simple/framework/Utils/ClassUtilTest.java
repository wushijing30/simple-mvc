package org.wusj.simple.framework.Utils;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wusj on 2017/9/24.
 */
public class ClassUtilTest {

    @Test
    public void getClassPathTest() {
        String classPath = ClassUtil.getClassPath();
        System.out.println("classPath: " + classPath);
    }

    @Test
    public void getClassSetTest() {
        Set<Class<?>> classSet;
        String packageName = "org.wusj.simple.framework";
        classSet = ClassUtil.getClassSet(packageName);
        for (Class<?> cls : classSet) {
            System.out.println(cls.getName());
        }
    }
}
