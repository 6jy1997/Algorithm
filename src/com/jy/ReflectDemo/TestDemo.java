package com.jy.ReflectDemo;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @description:
 * @author: Andy
 * @time: 2021/3/22 18:56
 */
public class TestDemo {



    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException {
        Class class1 = Class.forName("com.jy.ReflectDemo.User");
        Field[] declaredFields = class1.getDeclaredFields();
        // 遍历所有的成员
        for (int i = 0; i < declaredFields.length; i++) {
            // 获取类中的成员变量
            Field field = declaredFields[i];
            System.out.println("成员名称为：" + field.getName());
            Class fieldType = field.getType();
            System.out.println("成员类型为：" + fieldType);
            boolean isTurn = true;
        }



        class1.getMethod("add", String.class, int.class);
    }


//    public static void main (String[] args) throws ClassNotFoundException {
//        Class class1 = Class.forName("com.jy.ReflectDemo.User");
//        Field[] declaredFields = class1.getDeclaredFields();
//        // 遍历所有的成员
//        for (int i = 0; i < declaredFields.length; i++) {
//            // 获取类中的成员变量
//            Field field = declaredFields[i];
//            System.out.println("成员名称为：" + field.getName());
//            Class fieldType = field.getType();
//            System.out.println("成员类型为：" + fieldType);
//            boolean isTurn = true;
//        }
//
//    }

}
