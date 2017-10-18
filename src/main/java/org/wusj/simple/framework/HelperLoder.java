package org.wusj.simple.framework;

import org.wusj.simple.framework.Utils.ClassUtil;
import org.wusj.simple.framework.helper.BeanHelper;
import org.wusj.simple.framework.helper.ClassHelper;
import org.wusj.simple.framework.helper.ControllerHelper;
import org.wusj.simple.framework.helper.IocHelper;

/**
 * 加载相应的Helpper类
 * Created by wusj on 2017/10/17.
 */
public final class HelperLoder {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
