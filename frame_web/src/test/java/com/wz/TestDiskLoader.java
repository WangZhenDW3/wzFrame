package com.wz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangzhen on 2018/5/9.
 */
public class TestDiskLoader {
    public static void main(String[] args) {
        DiskClassLoader loader=new DiskClassLoader("C:\\Users\\haier\\Desktop");
        try {
            //加载class文件
            Class c = loader.loadClass("com.wz.HelloTestLoader");

            if(c != null){
                try {
                    Object obj = c.newInstance();
                    Method method = c.getDeclaredMethod("say",null);
                    //通过反射调用Test类的say方法
                    method.invoke(obj, null);
                } catch (InstantiationException | IllegalAccessException
                        | NoSuchMethodException
                        | SecurityException |
                        IllegalArgumentException |
                        InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
